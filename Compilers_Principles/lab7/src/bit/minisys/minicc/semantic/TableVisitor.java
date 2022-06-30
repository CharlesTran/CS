package bit.minisys.minicc.semantic;
import bit.minisys.minicc.parser.ast.*;

public class TableVisitor implements ASTVisitor{
    SymbolTable localtable;
    SymbolTable globaltable;
    ErrorType errorType;
    boolean judge_return;
    int iteration_level;
    public TableVisitor(SymbolTable table,ErrorType error){
        localtable = table;
        globaltable = table;
        errorType = error;
        iteration_level = 0;
        judge_return = false;
    }
    @Override
    public void visit(ASTCompilationUnit program)throws Exception{
        program.scope = globaltable;
        for(ASTNode node : program.items){
            if (node instanceof ASTFunctionDefine) {
                visit((ASTFunctionDefine) node);
            }else if(node instanceof ASTDeclaration){
                visit((ASTDeclaration) node);
            }//error
        }
    }
    @Override
    public void visit(ASTDeclaration declaration)throws Exception{
        if(declaration == null)
            return;
        declaration.scope = localtable;
        StringBuilder type = new StringBuilder();
        for (ASTToken specifierToken : declaration.specifiers){
            type.append(" ").append(specifierToken.value);
        }
        for (ASTInitList node : declaration.initLists){
            this.visit(node);
            String name = node.declarator.getName();
            if(localtable.find_cur(name)){
                errorType.addES02(name);
                return;
            }else{
                if(declaration.scope == globaltable)
                    globaltable.addvar(name, type.toString());
                else
                    localtable.addvar(name, type.toString());
            }
        }
    }
    @Override
    public void visit(ASTArrayDeclarator arrayDeclarator)throws Exception{
        if(arrayDeclarator == null)
            return;
    }
    @Override
    public void visit(ASTVariableDeclarator variableDeclarator)throws Exception{
        if(variableDeclarator == null)
            return;
        variableDeclarator.scope = this.localtable;
    }
    @Override
    public void visit(ASTFunctionDeclarator functionDeclarator)throws Exception{
        if(functionDeclarator == null)
            return;
        this.visit(functionDeclarator.declarator);
    }
    @Override
    public void visit(ASTParamsDeclarator paramsDeclarator)throws Exception{
        if(paramsDeclarator == null)
            return;
    }
    @Override
    public void visit(ASTArrayAccess arrayAccess)throws Exception{
        if(arrayAccess == null)
            return;
    }
    @Override
    public void visit(ASTBinaryExpression binaryExpression)throws Exception{
        if(binaryExpression == null)
            return;
        visit(binaryExpression.expr1);
        visit(binaryExpression.expr2);
    }
    @Override
    public void visit(ASTBreakStatement breakStat)throws Exception{
        if(breakStat == null)
            return;
        if(iteration_level == 0){
            errorType.addES03();
        }
    }
    @Override
    public void visit(ASTContinueStatement continueStatement)throws Exception{
        if(continueStatement == null)
            return;
    }
    @Override
    public void visit(ASTCastExpression castExpression)throws Exception{
        if(castExpression == null)
            return;
    }
    @Override
    public void visit(ASTCharConstant charConst)throws Exception{
        if(charConst == null)
            return;
    }
    @Override
    public void visit(ASTCompoundStatement compoundStat)throws Exception{
        if(compoundStat == null)
            return;
        compoundStat.scope = localtable;
        localtable = new SymbolTable();
        localtable.father = compoundStat.scope;
        for(ASTNode node : compoundStat.blockItems){
            if(node instanceof ASTDeclaration)
                visit((ASTDeclaration) node);
            else if(node instanceof ASTStatement){
                visit((ASTStatement) node);
            }
        }
        this.localtable = localtable.father;
    }
    @Override
    public void visit(ASTConditionExpression conditionExpression)throws Exception{
        if(conditionExpression == null)
            return;
    }
    @Override
    public void visit(ASTExpression expression)throws Exception{
        if(expression == null)
            return;
        if(expression instanceof ASTIdentifier){
            visit((ASTIdentifier) expression);
        } else if (expression instanceof ASTArrayAccess) {
            visit((ASTArrayAccess) expression);
        } else if (expression instanceof ASTBinaryExpression) {
            visit((ASTBinaryExpression) expression);
        } else if (expression instanceof ASTCastExpression) {
            visit((ASTCastExpression) expression);
        } else if (expression instanceof ASTCharConstant) {
            visit((ASTCharConstant) expression);
        } else if (expression instanceof ASTConditionExpression) {
            visit((ASTConditionExpression) expression);
        } else if (expression instanceof ASTFloatConstant) {
            visit((ASTFloatConstant) expression);
        } else if (expression instanceof ASTFunctionCall) {
            visit((ASTFunctionCall) expression);
        } else if (expression instanceof ASTIntegerConstant) {
            visit((ASTIntegerConstant) expression);
        } else if (expression instanceof ASTMemberAccess) {
            visit((ASTMemberAccess) expression);
        } else if (expression instanceof ASTPostfixExpression) {
            visit((ASTPostfixExpression) expression);
        } else if (expression instanceof ASTStringConstant) {
            visit((ASTStringConstant) expression);
        } else if (expression instanceof ASTUnaryExpression) {
            visit((ASTUnaryExpression) expression);
        } else if (expression instanceof ASTUnaryTypename) {
            visit((ASTUnaryTypename) expression);
        }
    }
    @Override
    public void visit(ASTExpressionStatement expressionStat)throws Exception{
        if(expressionStat == null)
            return;
    }
    @Override
    public void visit(ASTFloatConstant floatConst)throws Exception{
        if(floatConst == null)
            return;
    }
    @Override
    public void visit(ASTFunctionCall funcCall)throws Exception{
        if(funcCall == null)
            return;
    }
    @Override
    public void visit(ASTGotoStatement gotoStat)throws Exception{
        if(gotoStat == null)
            return;
    }
    @Override
    public void visit(ASTIdentifier identifier)throws Exception{
        if(identifier == null)
            return;
        String name = identifier.value;
        if(!this.localtable.find(name) && !this.globaltable.find(name)) {
            errorType.addES01(name);
        }
    }
    @Override
    public void visit(ASTInitList initList)throws Exception{
        if(initList == null)
            return;
        visit(initList.declarator);
        for(ASTExpression expr : initList.exprs){
            visit(expr);
        }
    }
    @Override
    public void visit(ASTIntegerConstant intConst)throws Exception{
        if(intConst == null) {
        }
    }
    @Override
    public void visit(ASTIterationDeclaredStatement iterationDeclaredStat)throws Exception{
        if(iterationDeclaredStat == null)
            return;
        iterationDeclaredStat.scope = localtable;
        localtable = new SymbolTable();
        localtable.father = iterationDeclaredStat.scope;
        if(iterationDeclaredStat.init !=null) {
            ASTDeclaration expr = iterationDeclaredStat.init;
            this.visit(expr);
        }
        if(iterationDeclaredStat.cond !=null) {
            for(ASTExpression expr : iterationDeclaredStat.cond) {
                this.visit(expr);
            }
        }
        if(iterationDeclaredStat.step !=null) {
            for(ASTExpression expr : iterationDeclaredStat.step) {
                this.visit(expr);
            }
        }
        iteration_level++;
        this.visit(iterationDeclaredStat.stat);
        iteration_level--;
        this.localtable = localtable.father;
    }
    @Override
    public void visit(ASTIterationStatement iterationStat)throws Exception{
        if(iterationStat == null)
            return;
        iterationStat.scope = localtable;
        if(iterationStat.init !=null) {
            for(ASTExpression expr : iterationStat.init) {
                this.visit(expr);
            }
        }
        if(iterationStat.cond !=null) {
            for(ASTExpression expr : iterationStat.cond) {
                this.visit(expr);
            }
        }
        if(iterationStat.step !=null) {
            for(ASTExpression expr : iterationStat.step) {
                this.visit(expr);
            }
        }
        this.iteration_level++;
        this.visit(iterationStat.stat);
        this.iteration_level--;
        this.localtable = iterationStat.scope;
    }
    @Override
    public void visit(ASTLabeledStatement labeledStat)throws Exception{}
    @Override
    public void visit(ASTMemberAccess memberAccess)throws Exception{}
    @Override
    public void visit(ASTPostfixExpression postfixExpression)throws Exception{}
    @Override
    public void visit(ASTReturnStatement returnStat)throws Exception{
        if(returnStat == null)
            return;
        if(returnStat.expr != null) {
            for(ASTExpression expr : returnStat.expr) {
                visit(expr);
                if(expr!=null)
                    judge_return = true;
            }
        }
    }
    @Override
    public void visit(ASTSelectionStatement selectionStat)throws Exception{}
    @Override
    public void visit(ASTStringConstant stringConst)throws Exception{}
    @Override
    public void visit(ASTTypename typename)throws Exception{}
    @Override
    public void visit(ASTUnaryExpression unaryExpression)throws Exception{}
    @Override
    public void visit(ASTUnaryTypename unaryTypename)throws Exception{}
    @Override
    public void visit(ASTFunctionDefine functionDefine)throws Exception{
        if(functionDefine == null)
            return;
        judge_return = false;
        String specifier = "";
        for (ASTToken specifierToken : functionDefine.specifiers) {
            specifier = specifier + specifierToken.value;
        }
        String funcname = functionDefine.declarator.getName();
        for(ASTParamsDeclarator param :((ASTFunctionDeclarator)functionDefine.declarator).params){
            String type = "";
            String name = param.declarator.getName();
            for (ASTToken specifierToken : param.specfiers) {
                type = type + specifierToken.value;
                this.localtable.addvar(name, type);
            }
        }
        visit(functionDefine.body);
        this.localtable = this.globaltable;
        if( !specifier.equals("void") && judge_return == false) {
            errorType.addES07(funcname);
            return;
        }
        if(specifier.equals("void") && judge_return == true) {
            errorType.addES07(funcname);
            return;
        }
    }
    @Override
    public void visit(ASTDeclarator declarator)throws Exception{
        if(declarator == null)
            return;
        if(declarator instanceof ASTArrayDeclarator) {
            visit((ASTArrayDeclarator)declarator);
        }else if(declarator instanceof ASTVariableDeclarator) {
            visit((ASTVariableDeclarator)declarator);
        }else if(declarator instanceof ASTFunctionDeclarator) {
            visit((ASTFunctionDeclarator)declarator);
        }
    }
    @Override
    public void visit(ASTStatement statement)throws Exception{
        if(statement == null)
            return;
        if(statement instanceof ASTBreakStatement){
            visit((ASTBreakStatement) statement);
        } else if (statement instanceof ASTCompoundStatement) {
            visit((ASTCompoundStatement) statement);
        } else if (statement instanceof ASTContinueStatement) {
            visit((ASTContinueStatement) statement);
        } else if (statement instanceof ASTExpressionStatement) {
            visit((ASTExpressionStatement) statement);
        } else if (statement instanceof ASTGotoStatement) {
            visit((ASTGotoStatement) statement);
        } else if (statement instanceof ASTIterationDeclaredStatement) {
            visit((ASTIterationDeclaredStatement) statement);
        } else if (statement instanceof ASTIterationStatement) {
            visit((ASTIterationStatement) statement);
        } else if (statement instanceof ASTLabeledStatement) {
            visit((ASTLabeledStatement) statement);
        } else if (statement instanceof ASTReturnStatement) {
            visit((ASTReturnStatement) statement);
        } else if (statement instanceof ASTSelectionStatement) {
            visit((ASTSelectionStatement) statement);
        }
    }
    @Override
    public void visit(ASTToken token)throws Exception{}
}