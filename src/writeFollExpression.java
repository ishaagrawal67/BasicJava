import java.util.Scanner;

public class writeFollExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enterthe value of /'u' and /'v'");
        int u=sc.nextInt();
        int v=sc.nextInt();
        System.out.println("enter the value of /'a' and /'s'");
        int a=sc.nextInt();
        int s= sc.nextInt();
        int exp=((v*v) - (u*u)) /(2*a*s);
        System.out.println(exp);
    }
}
