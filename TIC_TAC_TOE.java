import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TIC_TAC_TOE {
   public static List<Integer> player1=new ArrayList<>();
  public  static   List<Integer> player2=new ArrayList<>();
    public static void main (String arg[])
    {
        char[][] bord= {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
        };
        printgamebord(bord);

        Scanner in=new Scanner(System.in);
        while (true) {

            System.out.println("Enter your position player 'X' (1-9): ");
            int pos = in.nextInt();
            System.out.println(pos);
            while(player1.contains(pos)|| player2.contains(pos))
            {
                System.out.println("Enter a valid choice !!");
                pos=in.nextInt();
            }
            addpice(pos, bord,"player1");
            System.out.println("Enter your position player 'O' (1-9): ");
            pos = in.nextInt();
            System.out.println(pos);
            while(player1.contains(pos)|| player2.contains(pos))
            {
                System.out.println("Enter a valid choice !!");
                pos=in.nextInt();
            }
            addpice(pos, bord,"player2");
           String winer= winningcheck();
           System.out.println(winer);
        }
    }

    private static String winningcheck() {
        List toprow= Arrays.asList(1,2,3);
        List midrow= Arrays.asList(4,5,6);
        List botrow= Arrays.asList(7,8,9);
        List topcol= Arrays.asList(1,4,7);
        List midcol= Arrays.asList(2,5,8);
        List botcol= Arrays.asList(3,6,9);
        List rightcross= Arrays.asList(3,5,7);
        List leftcross= Arrays.asList(1,5,9);
        List<List<Integer>> winning=new ArrayList<>();
        winning.add(toprow);
        winning.add(midrow);
        winning.add(botrow);
        winning.add(topcol);
        winning.add(midcol);
        winning.add(botcol);
        winning.add(rightcross);
        winning.add(leftcross);
        for(List l:winning)
        {
            if(player1.containsAll(l))
            {
                return "Congratulation player1 you win ";
            } else if (player2.containsAll(l)) {
                return "Congratulation player2 you win ";
            }else if( player2.size()+player1.size() ==9 )
            {
                return "the match is draw";
            }
        }

        return "";
    }

    private static void addpice(int pos, char[][] bord,String turn) {
        char symbol =' ';
        if(turn.equals("player1"))
        {
            symbol='X';
            player1.add(pos);
        }
        else {
            symbol='O';
            player2.add(pos);
        }
        switch (pos)
        {
            case 1:bord[0][0]=symbol;
                    break;
            case 2:bord[0][2]=symbol;
                    break;
            case 3:bord[0][4]=symbol;
                    break;
            case 4:bord[2][0]=symbol;
                    break;
            case 5:bord[2][2]=symbol;
                    break;
            case 6:bord[2][4]=symbol;
                    break;
            case 7:bord[4][0]=symbol;
                    break;
            case 8:bord[4][2]=symbol;
                   break;
            case 9:bord[4][4]=symbol;
                    break;
        }
        printgamebord(bord);
    }

    private static void printgamebord(char[][] bord) {
        for(char [] row:bord)
        {
            for(char c: row)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }



}
