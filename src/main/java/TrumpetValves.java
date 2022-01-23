public class TrumpetValves implements ISell{

    String material;

    int size;

    public TrumpetValves(String _material, int _size){
        this.material = _material;
        this.size = _size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }
}
