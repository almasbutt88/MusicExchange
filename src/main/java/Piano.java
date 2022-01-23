public class Piano extends AbstractInstrument implements ISell, IPlay{

    String _material;
    String _size;
    String _colour;
    int numberOfKeys;

    public Piano(String _material, String _size, String _colour, int _numberOfKeys, int _buyingPrice, int _sellingPrice){
        super(_material, _size, _colour, _buyingPrice, _sellingPrice);

        this.numberOfKeys = _numberOfKeys;
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

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }
    @Override
    public String play(String soundOfInstrument) {
        return "Piano music";
    }
}
