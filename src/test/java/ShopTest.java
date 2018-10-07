import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Flute flute;
    Guitar guitar;
    Piano piano;
    Violine violine;
    Shop shop;

    @Before
    public void before() {
      flute = new Flute("Amadeus", "black", "wood", "tube-like", "opening-like");
      guitar = new Guitar("Jimmy Hendrix", "psychodelic", "wood", "body-like", "chord");
      piano = new Piano("Steinway", "black", "wood", "wing", "piano-like");
      violine = new Violine("Stradivari", "wooden", "wood", "violine-like", "chords");
    }

    @Test
    public void shopHasName() {
        assertEquals("McGilloway/'s music market", shop.getName());
    }

    @Test
    public void shopCanAddMusicStuff() {
        shop.add(flute);
        assertEquals("flute", shop.getStockCount());
    }
}
