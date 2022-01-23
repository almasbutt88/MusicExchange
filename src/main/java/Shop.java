import java.util.ArrayList;

public class Shop implements {

    ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public int getTotalMarkUp() {
        return calculateMarkUp();
    }
}
