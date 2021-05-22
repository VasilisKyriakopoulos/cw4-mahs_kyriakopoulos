import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        try{
        BigInt num1 = new BigInt("34534512312");
        BigInt num2 = new BigInt("1002453423");
        System.out.println(BigInt.add(num1, num2));
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
