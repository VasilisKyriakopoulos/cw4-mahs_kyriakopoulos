import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        try{
        BigInt num1 = new BigInt("1110");
        BigInt num2 = new BigInt("1111");
        BigInt num3 = new BigInt("111231210");
        BigInt num4 = new BigInt("11153421");
        ArrayList<BigInt> megaloi = new ArrayList<BigInt>();
        megaloi.add(num3);
        megaloi.add(num4);
        megaloi.add(num2);
        megaloi.add(num1);
        System.out.println(megaloi);
        megaloi.sort(new BigIntComparatorModel());
        System.out.println(megaloi);
        System.out.println(num1.equals(num2));
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
