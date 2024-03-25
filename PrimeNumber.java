import java.util.*;
public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 1;

        for(int i=2;i<=num;i++){
            if(num%i == 0){
                count ++;
            }
        }

        if(count ==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }


        sc.close();
    }
}
