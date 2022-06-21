import java.util.Scanner;
public class checkNumberIsIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digits: ");
        boolean b= sc.hasNextInt();
        System.out.println(b);
    }
}
