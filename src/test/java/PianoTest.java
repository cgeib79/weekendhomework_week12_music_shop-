import org.junit.Before;

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
       piano = new Piano("Steinway", "black", "wood", "piano-shape", "piano-like", 1000, 2000)
    }
}
