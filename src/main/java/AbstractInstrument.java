public class AbstractInstrument {

    String material;
    String size;
    String colour;
    int buyingPrice;
    int sellingPrice;

    public AbstractInstrument(String _material, String _size, String _colour, int _buyingPrice, int _sellingPrice){
        this.material = _material;
        this.size = _size;
        this.colour = _colour;
        this.buyingPrice = _buyingPrice;
        this.sellingPrice = _sellingPrice;


    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
