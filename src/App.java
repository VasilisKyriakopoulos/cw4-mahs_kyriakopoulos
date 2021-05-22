import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
 
import javax.swing.text.html.HTMLDocument.Iterator;
 
public class App {
    public static void main(String[] args) {
        TreeSet<BigInt> set  = new TreeSet<BigInt>(new BigIntComparatorModel());
        try{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give a big integer:");
        BigInt num1 = new BigInt(input.nextLine());
        System.out.println("Give a big integer:");
        BigInt num2 = new BigInt( input.nextLine());
        System.out.println("The sum is :" + BigInt.add(num1, num2));
        if(num1.equals(num2)==1){
            System.out.println("The number :"+ num1 + " is bigger.");
        }
        else if(num1.equals(num2)==-1){
            System.out.println("The number :"+ num2 + " is bigger.");
        }
        else{
            System.out.println("The numbers are equal.");
        }
        
        while(true){
            System.out.println("Give a big integer:");
            set.add(new BigInt(input.nextLine()));   
        }
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println(set);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(BigInt num : set){
            String key = String.valueOf(num.countDigits());
            if(hm.get(key)==null){
                hm.put(key,1);
            }
            else{
                
                hm.replace(key,hm.get(key).intValue()+1);
            }
           
        }
 
        for (String i : hm.keySet()) {
            System.out.println(i+ " digits: "+ hm.get(i));
          }


 
    }
}