import java.util.Scanner;
public class factorialByWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while(i<=n) {
            f = f * i;
            i++;
        }
        System.out.println("the factorila number is: " + f);
    }
}
