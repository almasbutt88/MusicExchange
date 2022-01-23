import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassDrumsTest {

    BassDrum bassDrum;

    @Before
    public void before(){
        bassDrum = new BassDrum("metal", "medium", "red", 8, 200, 400);


    }

    @Test
    public void bassDrumHasMaterial(){
        assertEquals("metal", bassDrum.getMaterial());
    }


    @Test
    public void bassDrumHasSize(){
        assertEquals("medium", bassDrum.getSize());
    }

    @Test
    public void bassDrumHasColour(){
        assertEquals("red", bassDrum.getColour());
    }
    @Test
    public void bassDrumHasPlyCount(){
        assertEquals(8, bassDrum.getPlyCount());
    }

    @Test
    public void bassDrumHasBuyingPrice(){
        assertEquals(200, bassDrum.getBuyingPrice());
    }

    @Test
    public void bassDrumHasSellingPrice(){
        assertEquals(400, bassDrum.getSellingPrice());
    }

    @Test
    public void bassDrumHasMarkUp(){
        assertEquals(200, bassDrum.calculateMarkUp(bassDrum.buyingPrice, bassDrum.sellingPrice));
    }

}
