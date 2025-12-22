public class Roulette {
    public int Wheel(int coins, int color){
        int red = 1;
        int black = 2;
        int val = 0;
        int spot = (int)(Math.random()*2)+1;

        if(spot == red && color == red){
            val = coins * 2;
            System.out.println("red");
            return val;
        }
        else if(spot == black && color == black){
            val = coins * 2;
            System.out.println("black");
            return val;
        }
        else{
            if(spot == 1){
                System.out.println("red");
            }
            else{
                System.out.println("black");
            }
            
            return 0;
        }
    }
}
