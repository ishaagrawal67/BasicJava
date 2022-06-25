import java.util.Scanner;

public class printFirstOddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            //for 1 to 10 odd number
//            if(i%2!=0)
//                System.out.println(i);
           // for 10 odd numbers
            System.out.println(2*i+1);
        }
    }
}
