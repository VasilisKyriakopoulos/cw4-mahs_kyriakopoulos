import java.util.LinkedList;

public class BigInt {
    
    private LinkedList <String> list;

    public BigInt(String str){
        this.list = new LinkedList<String>();
        for(String s : str.split("")){
            list.addFirst(s);
        }

    } 
    public LinkedList<String> getList(){
        return list;
    }
    
}
