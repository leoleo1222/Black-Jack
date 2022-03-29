public class Card {
    private String[] card = new String[52];
    private String[] symbol = {"♠","♥","♦","♣"};
    private String[] cardNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    Card(){
        initializeCard();
    }

    public void initializeCard(){
        int cnt = 0;
        for(int i = 0; i < cardNum.length; i++){
            for(int j = 0; j < symbol.length; j++)
                card[cnt++] = cardNum[i] + "[" + symbol[j] + "]";
        }
    }

    public String[] getCard(){
        return card;
    }

    public void useCard(int index){
        card[index] = "N/A";
    }


}
