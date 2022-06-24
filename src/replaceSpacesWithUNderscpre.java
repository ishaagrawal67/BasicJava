import java.util.Scanner;
public class replaceSpacesWithUNderscpre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String str=sc.nextLine();
        System.out.println("string after replaces spaces with underscore");
        //string str="to lower case";
        str=str.replace(" ","_");
        System.out.println(str);
    }
}
