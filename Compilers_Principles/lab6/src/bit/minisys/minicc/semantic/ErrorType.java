package bit.minisys.minicc.semantic;
import java.util.LinkedList;
import java.util.List;

public class ErrorType {
    public List<Object> lis = new LinkedList<>();
    public void addES01(String name) {
        String error = "ES01 > ";
        error = error + "Identifier \""+ name + "\" is not defined";
        this.lis.add(error);
    }
    public void addES02(String var) {
        String error = "ES02 > ";
        error = error + "Declaration \""+var+ "\" is defined";
        this.lis.add(error);
    }
    public void addES03() {
        String error = "ES03 > ";
        error = error + "BreakStatement must be in a loop statement";
        this.lis.add(error);
    }
    public void addES07(String func) {
        String error = "ES08 > ";
        error = error + "function \"" +func + "\" lack of return";

        this.lis.add(error);
    }
    public void output() {
        if(lis.size()==0)
            return;
        System.out.println("Error:");
        for (Object li : this.lis) {
            System.out.println((String) li);
        }
    }
}
