
public class main {
    public static void main(String[] arg){
        Card c = new Card();
        System.out.println("Time to Start your Game (Black Jack)");
        System.out.print("Player name - ");
        Player p = new Player("Leo");
        int i = 0;
        int win = 0;
        int round = 1;
        int Charlie = 0;
        while(i < round){
            System.out.println(p);
            c.useCard(p.getPick());
            if(Math.min(p.getPoints()[0], p.getPoints()[1]) < 21 && p.getNumHand() == 5){
                System.out.println("Five card Charlie, Win");
                c.initializeCard();
                p.reset();
                win++;
                Charlie++;
                i++;
                System.out.printf("%2s\n","- - - - - - - - -");
            }
            if(p.getPoints()[0] == 21 || p.getPoints()[1] == 21){
                System.out.println("Reached 21, Win");
                c.initializeCard();
                p.reset();
                win++;
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
        System.out.println("Losing round ["+(round-win)+"]");
        System.out.println("Five card Charlie ["+Charlie+"]");

    }
}
