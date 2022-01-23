import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoWireTest {


    PianoWire pianoWire;


    @Before
    public void before(){
        pianoWire = new PianoWire("alloy", 60, 50, 70);


    }
    @Test
    public void hasMeterial(){
        assertEquals("alloy", pianoWire.getMaterial());
    }

    @Test
    public void hasLength(){
        assertEquals(60, pianoWire.getLength());
    }


    @Test
    public void pianoWireHasBuyingPrice(){
        assertEquals(50, pianoWire.getBuyingPrice());
    }

    @Test
    public void pianoWireHasSellingPrice(){
        assertEquals(70, pianoWire.getSellingPrice());
    }

    @Test
    public void pianoWireHasMarkUp(){
        assertEquals(20, pianoWire.calculateMarkUp(pianoWire.buyingPrice, pianoWire.sellingPrice));
    }

}
