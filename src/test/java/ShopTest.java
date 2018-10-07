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
      flute = new Flute("Amadeus", "black", "wood", "tube-like", "opening-like", 12.00, 24.00);
      guitar = new Guitar("Jimmy Hendrix", "psychodelic", "wood", "body-like", "chord");
      piano = new Piano("Steinway", "black", "wood", "wing", "piano-like");
      violine = new Violine("Stradivari", "wooden", "wood", "violine-like", "chords");
    }

    @Test
    public void shopHasName() {
        assertEquals("McGilloway/'s music market", shop.getName());
    }

    @Test
    public void shopCanAddToStock() {
        shop.add(flute);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.remove(flute);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canProvideMarkup() {
        shop.markUp(flute);
        assertEquals();
    }
}
