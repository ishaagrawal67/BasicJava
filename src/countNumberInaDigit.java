import java.util.Scanner;

public class countNumberInaDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, count=0;
        System.out.println("Please Enter any Number: ");
        n = sc.nextInt();

        while(n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
