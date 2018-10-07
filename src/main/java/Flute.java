import com.sun.xml.internal.ws.api.pipe.Tube;

public class Flute extends Instrument implements Playable, Sellable {

    Tube tube;


    public Flute(String modelName, String color, String material, String body, String keyboard, double buyingPrice, double sellingPrice) {
        super(modelName, color, material, body, keyboard, buyingPrice, sellingPrice);
        this.tube = tube;
    }

    public Tube getTube() {
        return tube;
    }


    public String play() {
        return "bing";
    }



}

