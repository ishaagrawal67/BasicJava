import java.util.Scanner;
public class convertKilometerIntoMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the values in kilometers");
        int kl=sc.nextInt();
        float miles = kl*0.62137f;
        System.out.println(miles);

    }
}
