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
    public void canPlay() {
        assertEquals("bing", flute.play());
    }


}
