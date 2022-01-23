public class PianoWire implements ISell{

    String material;
    int buyingPrice;
    int sellingPrice;
    int length;

    public PianoWire(String _material, int _length, int _buyingPrice, int _sellingPrice){
        this.material = _material;
        this.length = _length;
        this.buyingPrice = _buyingPrice;
        this.sellingPrice = _sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }
}

