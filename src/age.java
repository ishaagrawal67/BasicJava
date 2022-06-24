import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are adult");
                break;
            case 30:
                System.out.println("now you are ready for job");
                break;
            case 60:
                System.out.println("now you age is for retiernment");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
