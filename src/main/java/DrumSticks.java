public class DrumSticks extends AbstractInstrument implements ISell{


    int length;
    private String _material;
    private String _colour;
    private String _size;

    public DrumSticks(String _material, String _size, String _colour, int _length, int _buyingPrice, int _sellingPrice){
        super(_material, _size, _colour, _buyingPrice, _sellingPrice);
        this.length = _length;
    }

    public String get_material() {
        return _material;
    }

    public void set_material(String _material) {
        this._material = _material;
    }

    public String get_size() {
        return _size;
    }

    public void set_size(String _size) {
        this._size = _size;
    }

    public String get_colour() {
        return _colour;
    }

    public void set_colour(String _colour) {
        this._colour = _colour;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }
}
