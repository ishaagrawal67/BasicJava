import java.util.Scanner;
public class calculatorFindPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1 subject marks: ");
        int a = sc.nextInt();
        System.out.print("enter the 2 subject marks: ");
        int b = sc.nextInt();
        System.out.print("enter the 3 subject marks: ");
        int c = sc.nextInt();
        System.out.print("enter the 4 subject marks: ");
        int d = sc.nextInt();
        int total = a + b + c + d;
        float percentge = (total / 400.0f)*100;
        System.out.print("total percentage of the marks is " + percentge);
    }
}

