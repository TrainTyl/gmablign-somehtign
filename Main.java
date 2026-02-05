
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner text = new Scanner(System.in);
        Slot sp = new Slot();
        Wait wa = new Wait();
        Roulette rw = new Roulette();
        Blackjack bj = new Blackjack();
        int running = 1;
        int coins = 100;

        while (running == 1){
            System.out.println("Current Balance: " + coins + "\n1. Slots\n2. Roulette\n3. BlackJack\n9. Exit" );
            int game = text.nextInt();
            System.out.println();

            if (game == 1){
                if (coins >=1){
                coins -= 1;
                System.out.println("");
                coins = sp.Spin(coins);
                wa.wait(1000);
                }
                else{
                    System.out.println("Not Enough Coins");
                }
            }
            else if (game == 2){
                System.out.println("How Many Coins To Wager");
                int wager = text.nextInt();
                if (wager <= coins){
                   System.out.println("What Color 1. Red, 2. Black");
                   int color = text.nextInt();
                   if (color == 1){
                    coins -= wager;
                    coins += rw.Wheel(wager, 1);
                    wa.wait(1000);
                   }
                   else if (color ==2){
                    coins -= wager;
                    coins += rw.Wheel(wager, 2);
                    wa.wait(1000);
                   }
                   else{
                    System.out.println("Invalid Spot");
                   }
                }
                else{
                    System.out.println("Not Enough Coins To Wager");
                }
            }
            else if (game == 3){
                System.out.println("How Many Coins to Wager");
                int wager = text.nextInt();
                coins -= wager;
                coins += bj.Deal(wager);
                System.out.println();
                wa.wait(1000);
            }
            else if (game == 9){
                System.out.println("Thanks For Gambling");
                running = 0;
            }
            else{
                System.out.println("Invalid Game. Please Pick One of The Numbers:");
            }
        }
    }
}