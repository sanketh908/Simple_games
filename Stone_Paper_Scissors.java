
import java.util.Random;
import java.util.Scanner;


enum Maping{
    stone(0),paper(1),scissors(2)
    ;
    private int num;
    Maping(int i) {
        this.num=i;
    }
    public int getNum()
    {
        return num;
    }
}
public class Stone_Paper_Scissors {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int count =0;
        int computer_score=0;
        Maping userchoice;

        String str;
        while(true){

            int random_num=random.nextInt(3);
            System.out.println("Your Score :"+count);
            System.out.println("Computer score :"+computer_score);
            System.out.println("Stone , Paper , Scissor :");
            System.out.print("your choice :");
            str = scanner.nextLine();

            try
            {
             userchoice=Maping.valueOf(str);
            }catch (IllegalArgumentException e)
            {
                System.out.println("Enter the write spelling !!");
                continue;
            }
            int  userchoicenum= userchoice.getNum();
            if(str.equals("Exit"))
                break;
            if(random_num ==0)
            {
                System.out.println(" Computer choice :stone");
            }
            else if(random_num == 1)
            {
                System.out.println("Computer choice :paper");
            }
            else if( random_num == 2)
            {
                System.out.println("Computer choice :scissor");
            }
            if(userchoicenum == random_num)
            {
                System.out.println("draw");
            }
            else if (( userchoicenum ==0 && random_num == 2) ||(userchoicenum == 1 && random_num == 0) ||( userchoicenum==2 && random_num == 1) )
            {
                count++;
                System.out.println("YOU WIN THE ROUND !!");
            }
            else {
                computer_score++;
                System.out.println("COMPUTER WIN THE ROUND !!");
            }
            System.out.println("__________________________________________________________________________");

        }

    }
    }
