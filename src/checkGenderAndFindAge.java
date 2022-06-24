import java.util.Scanner;
public class checkGenderAndFindAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the gender male(M) of female(F) : ");
        char ch=sc.next().charAt(0);
        if(ch=='F')
        {
            System.out.println("She will work in urban area");
        }
        else if(ch=='M')
        {
            System.out.println("enter the age : ");
            int age=sc.nextInt();
            if(age>=20 && age<=40)
            {
                System.out.println("He may work in anywhere");
            }
            else if(age>=40 && age<=60)
            {
                System.out.println("He will work in urban ares only");
            }
            else {
                System.out.println("ERROR");
            }
        }
        else
        {
            System.out.println("Sorry!");
        }
    }
}
