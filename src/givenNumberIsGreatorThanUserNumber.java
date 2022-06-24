import java.util.Scanner;
public class givenNumberIsGreatorThanUserNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int given_number=34;
        boolean b=(number>given_number);
        System.out.println(b);
    }
}
