import java.util.concurrent.ThreadLocalRandom;

public class Player{
    private Card c = new Card();
    private String name;
    private int numHand;
    private String Hand;
    private final int[] points = new int[2];
    private int pick;

    Player(String name){
        this.Hand = "";
        this.name = name;
        this.pick = 0;
        System.out.println("Welcome " + name);
    }

    private String getHand(){
        pick = 0;
        do{
        pick = ThreadLocalRandom.current().nextInt(0, 13);
        }while (c.getCard()[pick * 4].equals("N/A"));
        Hand += c.getCard()[pick * 4];
        points[0] += pick + 1;
        if(Hand.contains("A"))
            points[1] += pick + 11;
        else
            points[1] += pick + 1;
        numHand++;
        return Hand;
    }

    public int[] getPoints(){
        return points;
    }

    public int getNumHand(){ return numHand;}

    public int getPick(){
        return pick;
    }

    public String toString(){
        return "Hand: " + getHand()
                + "\nPoints: [" + points[0] + "]"
                + ((Hand.contains("A") && points[1] <= 21? " or [" + points[1] + "]":""));
    }

    public void reset(){
        points[0] = 0;
        points[1] = 0;
        Hand = "";
        numHand = 0;
    }

}
