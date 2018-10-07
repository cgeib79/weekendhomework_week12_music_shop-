public class Violine extends Instrument implements Playable, Sellable  {

    Chords chords;

    public Violine(String modelName, String color, String material, String body, String keyboard, double buyingPrice, double sellingPrice) {
        super(modelName, color, material, body, keyboard, buyingPrice, sellingPrice);
        this.chords = chords;
    }

    public Chords getChords() {
        return chords;
    }


    public String play() {
        return "bing";
    }

    public double markUp() {
        return markUp();
    }
}
