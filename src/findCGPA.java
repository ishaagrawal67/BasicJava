import java.util.Scanner;
public class findCGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks in 1 subject: ");
        int a= sc.nextInt();
        System.out.print("\nenter the marks in 2 subject: ");
        int b=sc.nextInt();
        System.out.print("\nenter the marks in 3 subject: ");
        int c=sc.nextInt();
        int total=a+b+c;
         float CGPA=total/30;
        System.out.println("CGPA of tha marks is: ");
        System.out.print(CGPA);
    }
}
