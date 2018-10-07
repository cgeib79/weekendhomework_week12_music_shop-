import java.util.ArrayList;

public class Shop {
    private ArrayList<Playable> musicStuff;
    private String name;


    public Shop(ArrayList<Playable> musicStuff, String name) {
        this.musicStuff = musicStuff;
        this.name = name;

    }

    public ArrayList<Playable> getMusicStuff() {
        return musicStuff;
    }

    public String getName() {
        return name;
    }

    public int getStockCount(){
        return this.musicStuff.size();
    }

    public void add(Playable musicStuff) {
        this.musicStuff.add(musicStuff);
    }

    public void remove(Flute flute) {
        this.musicStuff.remove(musicStuff);
    }


}
