import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base and height");
        int b= sc.nextInt();
        int h=sc.nextInt();
        int area=(b*h)/2;
        System.out.println("area of triengle of is : "+area);
    }
}
