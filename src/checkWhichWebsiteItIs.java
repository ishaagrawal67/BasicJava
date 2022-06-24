import java.util.Scanner;
public class checkWhichWebsiteItIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the website name : ");
        String web = sc.next();
        if (web.endsWith(".org"))
        {
            System.out.println("This is an Organisational Website");
        }
        else if(web.endsWith(".com"))
        {
            System.out.println("This is an Commercial Website");
        }
        else if(web.endsWith(".in"))
        {
            System.out.println("This is an Indian Website");
        }
    }
}