import java.util.Scanner;
import java.util.Random;
public class ExerciseProject01RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter your choice from 0 is rock,1 is paper,2 is scissor: ");
        int uInput=sc.nextInt();
        Random random = new Random();
        int computerInput=random.nextInt(3);
        if(computerInput==uInput)
        {
            System.out.println("Match is Draw!");
        }
        else if(uInput==0&&computerInput==2 || uInput==1&&computerInput==0 || uInput==2&&computerInput==1)
        {
            System.out.println("Match is You Win!");
        }
        else
            System.out.println("Match is Computer Win!");
        System.out.println("computer choice is : "+computerInput);
        if(computerInput==0)
            System.out.println("choic is rock");
        else if(computerInput==1)
            System.out.println("choice is paper");
        else if(computerInput==2)
            System.out.println("choice is scisor");
    }

}
