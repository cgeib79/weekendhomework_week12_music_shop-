public class Piano extends Instrument implements Playable, Sellable {

    Pedals pedals;

    public Piano(String modelName, String color, String material, String body, String keyboard, double buyingPrice, double sellingPrice) {
        super(modelName, color, material, body, keyboard, buyingPrice, sellingPrice);
        this.pedals = pedals;
    }

    public Pedals getPedals() {
        return pedals;
    }


    public String play() {
        return "bing";
    }


    public double markUp() {
        return markUp();
    }
}
