import java.util.InputMismatchException;
import java.util.LinkedList;

public class BigInt  {
    
    private LinkedList <Integer> list;

    public BigInt(String str) throws InputMismatchException{
        this.list = new LinkedList<Integer>();
        for(String s : str.split("")){
            if (Character.isDigit(s.charAt(0))){
                list.addFirst(Integer.parseInt(s));
            }
            else{
                throw new InputMismatchException("Character is not Digit");
            }
            
        }

    } 
    public LinkedList<Integer> getList(){
        return list;
    }
    public int countDigits(){
        return list.size();
    }
    public String toString(){
        String s="";
        for (int i = list.size()-1;i>=0;i--){
            s += list.get(i);
        }
        return s;
    }
    public int equals(BigInt number){
        if(this.countDigits()>number.countDigits()){
            return 1; 
        }
        else if(this.countDigits()<number.countDigits()){
            return -1; 
        }
        else{
            for(int i=this.countDigits()-1;i>=0;i--){
                if(this.getList().get(i) > number.getList().get(i)){
                    return 1;
                }
                else if(this.getList().get(i) < number.getList().get(i)){
                    return -1;
                }
            }
            return 0;
        }
         
    }
}