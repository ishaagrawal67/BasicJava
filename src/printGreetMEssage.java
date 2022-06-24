import java.util.Scanner;
public class printGreetMEssage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name : ");
        String str=sc.next();
        System.out.println("hello "+str+" have a great day");
    }
}
