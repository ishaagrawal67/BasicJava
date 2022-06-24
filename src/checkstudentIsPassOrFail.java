import java.util.Scanner;
public class checkstudentIsPassOrFail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks in phyics");
        int phy=sc.nextInt();
        System.out.println("enter the marks in math");
        int math=sc.nextInt();
        System.out.println("enter the marksin chmistry");
        int chm=sc.nextInt();
        float avg=(phy+math+chm)/3.0f;
        if(avg>=40 && phy>=33 && math>=33 && chm>=33)
        {
            System.out.println("congrates you are pass!");
        }
        else
            System.out.println("sorry you are fail!");
    }
}

