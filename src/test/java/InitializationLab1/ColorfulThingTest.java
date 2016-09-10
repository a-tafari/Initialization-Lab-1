package InitializationLab1;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by abijah on 9/10/16.
 */
public class ColorfulThingTest {

    @Test
    public void addTest () {
    ColorfulThing colytest = new ColorfulThing(ColorfulThing.Color.BLUE);
        assertSame("Value should be blue", ColorfulThing.Color.YELLOW, colytest.getColor());

    }
}
