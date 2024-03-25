import java.util.Scanner;

/**
 * FibonacciSeries
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+ " " + b+" ");
        
        for(int i=3;i<num;i++){

            int c = a + b ; 
            a = b;
            b = c;
            
            System.out.print(c+ " ");
            sc.close();
        }

    }
}