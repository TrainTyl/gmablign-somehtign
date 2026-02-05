import java.util.Scanner;

public class BCards {
    public int Give(){
        Scanner text = new Scanner(System.in);
        int card1 = (int)((Math.random() * 13)+2);
        if(card1 == 11 || card1 == 12 || card1 == 13){
            card1 = 10;
        }
        else if(card1 == 14){
            System.out.println("You got an Ace, would you like the value to be 1 or 11: ");
            card1 = text.nextInt();
            while (card1 != 1 && card1 != 11){
                System.out.println("Invalid Value");
                card1 = text.nextInt();
            }
        }
        System.out.println("You got a " + card1);
        return card1;
    }
    
}
