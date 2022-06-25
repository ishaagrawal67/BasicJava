import java.util.Scanner;
public class printFIrstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr the last number ");
        int n=sc.nextInt();
        System.out.println("first natural number is :");
        int i=1;
        System.out.println("by do-while loop");
       do{
            System.out.println(i);
            i++;
        }while(i<=n);
       int j=1;
        System.out.println("by while loop");
        while(j<=n)
        {
            System.out.println(j);
            j++;
        }
    }
}
