import java.util.*;
public class ReverseNumber {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0;
        System.out.println("Reverse Number is : ");

        // while(num>0){
        //     rev = rev * 10 + num %10;
        //     num = num / 10;
        // }
     
        for(;num!=0; num = num/10){
            rev = rev * 10 + num % 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
