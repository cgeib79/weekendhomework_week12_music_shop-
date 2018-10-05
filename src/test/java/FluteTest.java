import org.junit.Before;
import org.junit.Test;

public class FluteTest {
    Flute flute;

    @Before
    public void before()  {

        flute = new Flute("Amadeus", "black", "wood", "flute-like", "opening-like");
    }

    @Test
    public String play() {
        return "bing";
    }
}
