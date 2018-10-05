import com.sun.xml.internal.ws.api.pipe.Tube;

public class Flute extends Instrument implements Playable, Sellable {

    Tube tube;


    public Flute(String modelName, String color, String material, String body, String keyboard) {
        super(modelName, color, material, body, keyboard);
        this.tube = tube;
    }

    public Tube getTube() {
        return tube;
    }


    public String play() {
        return play();
    }


    public double markUp() {
        return markUp();
    }
}

