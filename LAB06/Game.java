import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Game{
    private String kai(String k){
        if (k.equals("0")){
            return "ROCK";
        }else if (k.equals("1")){
            return "PAPER";
        }else if (k.equals("2")){
            return "SCISSORS";
        }else{
            return "Huew kaow";
        }
    }
    public void play(){
        Scanner input= new Scanner(System.in);
        int winA=0;
        int winB=0;
        Random rand=new Random();
        while (Math.abs(winA-winB)<2){
            String player="";
            while (!(player.equals("0") || player.equals("2") || player.equals("1"))){
                System.out.println("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
                player=input.next();
            }
            String P1=kai(player);
            String P2=kai(rand.nextInt(3)+"");
            System.out.println("You enter: "+P1);
            System.out.println("Computer: "+P2);
            if (P1.equals(P2)){
                System.out.println("it's a tie");
            }else if (((P1.equals("SCISSORS"))&&(P2.equals("PAPER"))) || ((P1.equals("PAPER"))&&(P2.equals("ROCK"))) || ((P1.equals("ROCK")&&P2.equals("SCISSORS")))){
                System.out.println("You win!!");
                winA++;
            }else{
                System.out.println("You lose!");
                winB++;
            }
        }
        System.out.println("----------------------");
        if (winA>winB){
            System.out.println("Congrats! You win.");
        }else {
            System.out.println("Too bad! You lose.");
        }
        System.out.println("User Score: "+ winA);
        System.out.println("Computer Score: "+winB);
        input.close();
    
    }

    }

