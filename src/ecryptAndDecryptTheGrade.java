import java.util.Scanner;
public class ecryptAndDecryptTheGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char grade=sc.next().charAt(0);
        System.out.println("By incrypt tha grade");
         grade=(char)(grade+8);
        System.out.println(grade);
        System.out.println("By decrypt the grade");
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
