import java.util.Comparator;

public class BigIntComparatorModel implements Comparator<BigInt> {
        @Override
        public int compare(BigInt num1 , BigInt num2){
            if(num1.countDigits()>num2.countDigits()){
                return 1; 
            }
            else if(num1.countDigits()<num2.countDigits()){
                return -1; 
            }
            else{
                for(int i=num1.countDigits()-1;i>=0;i--){
                    if(num1.getList().get(i) > num2.getList().get(i)){
                        return 1;
                    }
                    else if(num1.getList().get(i) < num2.getList().get(i)){
                        return -1;
                    }
                }
                return 0;
            }
             
        }
    }
