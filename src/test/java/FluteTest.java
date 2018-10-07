import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FluteTest {
    Flute flute;

    @Before
    public void before()  {

        flute = new Flute("Amadeus", "black", "wood", "flute-like", "opening-like");
    }

    @Test
    public void hasModelName() {
        assertEquals("Amadeus", flute.getModelName());
    }

    @Test
    public void hasColor() {
        assertEquals("black", flute.getColor());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", flute.getMaterial());
    }

    @Test
    public void hasBody() {
        assertEquals("flute-like", flute.getBody());
    }

    @Test
    public void hasKeyboard() {
        assertEquals("opening-like", flute.getKeyboard());
    }

    @Test
    public void canPlay() {
        assertEquals("bing", flute.play());
    }

}
