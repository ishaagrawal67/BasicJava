import java.util.Scanner;

public class sumFirstEvenNumberByWhileLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int i=1;
        int s=0;
        while(i<=n)
        {
            if(i%2==0) {
                s=s+i;
            }
            i++;
        }
        System.out.println("sum of first even number is : "+s);
    }
}
