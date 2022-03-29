import java.util.Scanner;

public class main {
    public static void main(String[] arg){
        Card c = new Card();
        System.out.println("Time to Start your Game (Black Jack)");
        System.out.print("Player name - ");
        Scanner sc = new Scanner(System.in);
        Player p = new Player("Leo");
        int i = 0;
        int win = 0;
        int round = 10000;
        int dragon = 0;
        while(i < round){
            System.out.println(p);
            c.useCard(p.getPick());
            if(Math.min(p.getPoints()[0], p.getPoints()[1]) < 21 && p.getNumHand() == 5){
                System.out.println("Dragon, Win");
                c.initializeCard();
                p.reset();
                win++;
                dragon++;
                i++;
                System.out.printf("%2s\n","- - - - - - - - -");
            }
            if(p.getPoints()[0] == 21 || p.getPoints()[1] == 21){
                System.out.println("Reached 21, Win");
                c.initializeCard();
                p.reset();
                win++;
                if(p.getNumHand() == 5)
                    dragon++;
                i++;
                System.out.printf("%2s\n","- - - - - - - - -");
            }
            if(Math.min(p.getPoints()[0], p.getPoints()[1]) > 21){
                System.out.println("Over 21, Lost");
                c.initializeCard();
                p.reset();
                i++;
                System.out.printf("%2s\n","- - - - - - - - -");
            }
        }
        System.out.println("Winning round ["+win+"]");
        System.out.println("Dragon ["+dragon+"]");
    }
}
