import java.util.Scanner;

public class Blackjack {
    public int Deal(int coins){
        Scanner text = new Scanner(System.in);
        Wait wa = new Wait();
        int points = 0;
        int playing = 1;
        BCards card1 = new BCards(); int c1 = card1.Give(); points += c1;
        BCards card2 = new BCards(); int c2 = card2.Give(); points += c2;
        int payout;
        

        while (playing == 1){
            payout = coins + ((coins + points) / 2);
            System.out.println();
            wa.wait(1000);
            System.out.println("Current Card Value: " + points);
            System.out.println("Current Payout: " + payout);
            System.out.println("Hit: 1\nStand: 2");
            int choice = text.nextInt();
            
            if(choice == 1){
                points += card1.Give();
            }
            else if(choice == 2){
                System.out.println();
                System.out.println("Congrats You Won " + payout + " Tokens!");
                return payout;
            }
            else{
                System.out.println("Invalid Choice");
            }

            if(points == 21){
                System.out.println();
                System.out.println("Blackjack!\nYou Win " + payout * 2 + " Tokens!");
                return payout * 2;
            }
            if(points > 21){
                System.out.println();
                System.out.println("You Went Over\nYou Win Nothing :(");
                return 0;
            }
        }
        return 0;

        
    }
}
