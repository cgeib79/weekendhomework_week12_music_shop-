public class Guitar extends Instrument implements  Playable, Sellable  {

    GuitarNeck guitarNeck;

    public Guitar(String modelName, String color, String material, String body, String keyboard, double buyingPrice, double sellingPrice) {
        super(modelName, color, material, body, keyboard, buyingPrice, sellingPrice);
        this.guitarNeck = guitarNeck;
    }

    public GuitarNeck getGuitarNeck() {
        return guitarNeck;
    }

    public String play() {
        return "bing";
    }


    public double markUp() {
        return markUp();
    }
}
