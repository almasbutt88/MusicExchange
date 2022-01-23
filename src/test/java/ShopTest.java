import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    BassDrum bassDrum;
    DrumSticks drumSticks;
    Guitar guitar;
    GuitarStrings guitarStrings;
    Piano piano;
    PianoWire pianoWire;
    Shop shop = new Shop();
    Trumpet trumpet;
    TrumpetValves trumpetValves;


    public void before(){
        bassDrum = new BassDrum("metal", "medium", "red", 8, 150, 300);
        guitar = new Guitar("oak", "large", "blue", 2, 450, 800);
        guitarStrings = new GuitarStrings("alloy", "0.2", "bronze", 60, 500, 750);
        piano = new Piano("cedar", "small", "cherry", 24, 350, 500 );
        pianoWire = new PianoWire("metal", 80, 50, 70);

        trumpet = new Trumpet("metal", "medium", "gold", 8, 200, 220);
        trumpetValves = new TrumpetValves("brass", 3);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.stock.size());
    }
    @Test
    public void canAddStock(){
        shop.stock.add(guitar);
        assertEquals(1, shop.stock.size());
    }

    @Test
    public void canRemoveStock(){
        shop.stock.add(guitar);

        shop.stock.remove(guitar);
        assertEquals(0, shop.stock.size());

    }
    @Test
    public void totalMarkUp(){
        shop.stock.add(guitar);
        shop.stock.add(guitarStrings);
        shop.stock.add(piano);
        shop.stock.add(pianoWire);
        shop.stock.add(trumpet);
        shop.stock.add(trumpetValves);
        shop.stock.add(bassDrum);

        assertEquals(910, shop.getTotalMarkUp());
    }
}
