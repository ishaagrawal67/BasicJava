import java.util.Scanner;
public class multiplyTableInReverseOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("number for table");
        int n= sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            System.out.println(+n+"*"+i+"="+n*i);
        }
    }
}
