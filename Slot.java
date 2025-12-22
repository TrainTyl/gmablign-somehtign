public class Slot {
    public int Spin(int coins) {
        int slot1 = (int)(Math.random()*9)+1;
        int slot2 = (int)(Math.random()*9)+1;
        int slot3 = (int)(Math.random()*9)+1;

        
        System.out.println(slot1 + "" + slot2 + "" + slot3);
        //System.out.println("");
        if (slot1 == 1 && slot2 == 1 && slot3 == 1){
            return coins += 30;
        }
        else if (slot1 == 2 && slot2 == 2 && slot3 == 2){
            return coins += 40;
        }
        else if (slot1 == 3 && slot2 == 3 && slot3 == 3){
            return coins += 50;
        }
        else if (slot1 == 4 && slot2 == 4 && slot3 == 4){
            return coins += 60;
        }
        else if (slot1 == 5 && slot2 == 5 && slot3 == 5){
            return coins += 70;
        }
        else if (slot1 == 6 && slot2 == 6 && slot3 == 6){
            return coins += 80;
        }
        else if (slot1 == 7 && slot2 == 7 && slot3 == 7){
            System.out.println("JACKPOT");
            return coins += 200;
        }
        else if (slot1 == 8 && slot2 == 8 && slot3 == 8){
            return coins += 90;
        }
        else if (slot1 == 9 && slot2 == 9 && slot3 == 9){
            return coins += 100;
        }
        else{
            return coins;
        }
    }
}
