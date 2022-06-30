package bit.minisys.minicc.semantic;

import java.util.LinkedList;
import java.util.List;

public class SymbolTable {
    public SymbolTable father;
    public List<String> items_name = new LinkedList<String>() {};
    public List<String> items_type = new LinkedList<String>() {};
    public void addvar(String name, String type) {
        items_name.add(name);
        items_type.add(type);
    }
    public boolean find_cur(String name) {
        return this.items_name.contains(name);
    }
    public boolean find(String name) {
        if (this.items_name.contains(name))
            return true;
        else {
            if (this.father == null)
                return false;
            else
                return father.find(name);
        }
    }
}