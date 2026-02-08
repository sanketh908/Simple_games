import java.util.Random;
import java.util.Scanner;

public class guess_the_number_game {
   public static  Scanner in=new Scanner(System.in);
   public static Random rand=new Random();
    public static void easymode(int k,int guss)

    {
        int number =rand.nextInt(guss);
        
        System.out.println("you have "+k+"attemts \nguesse the randome number between  to  "+guss);
        for(int i=0;i<k;i++)
        {
            int num=in.nextInt();
            if(num==number )
            {
                System.out.println("===============================================================================");
                System.out.println("|***********Congratulations! You guessed the correct number.******************|");
                 System.out.println("===============================================================================");
                System.out.println("Do you want to play again ?\n press 1 to play again \n press 2 to exit the game ");
                number =in.nextInt();
                if(number==1)
                {
                    return;
                }
                else
                {
                    System.exit(0);
                }
            }
            else if(num <number )
            {
                System.out.println("the number is greater then "+num);

            }
            else if(num>number )
            {
                System.out.println("the number is smaller then "+num);

            }
            
        }
        System.out.println("You've exhausted all attempts. The correct number was: " + number);
        System.out.println("great gesses\n try again ?\npress 1 to play again \npress 2 to exit the game     ");
        number=in.nextInt();
        switch (number) {
            case 1:
            return;
                
            case 2:
            System.exit(0);
        
            default:
            System.out.println("in valid choice !!");
                break;
        }




    }
    public static void main(String[] args)  {
       
         while(true)
       try{
        {
       
       System.out.println("Enter the game difficult");
       System.out.println("press 1 for easy  mode :");
       System.out.println("press 2 for mediume difficult mode :  ");
       System.out.println("press 3 for hard difficult mode");
       System.out.println("press 4 to make a costume round ");
       System.out.println("Enter 5 to exit the game !!");
       
       int n=in.nextInt();
       switch (n) {
        case 1:
        easymode(5,10);
            break;
        case 2:
        easymode(7,50);
        break;
        case 3:
        easymode(8,100);
        break;
        case 4:
        System.out.println("enter the upper renge of the rendome number :");
        int r=in.nextInt();
        System.out.println("Enter the number of attempts:");
        int a=in.nextInt();
        easymode(a,r);
        case 5:
        System.exit(0);
        default:
        System.out.println("invalid choice !!!!");
            break;
       } 
    }
       } catch (Exception e) {
        System.out.println("Enter number only ");
        in.nextLine();
        
       }
    }
}
