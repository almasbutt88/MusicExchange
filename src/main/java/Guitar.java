public class Guitar extends AbstractInstrument implements ISell, IPlay{

    String _material;
    String _size;
    String _colour;
    int numberOfPicks;

    public Guitar(String _material, String _size, String _colour, int _numberOfPicks, int _buyingPrice, int _sellingPrice){
        super(_material, _size, _colour, _buyingPrice, _sellingPrice);
        this.numberOfPicks= _numberOfPicks;
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

    public int getNumberOfPicks() {
        return numberOfPicks;
    }

    public void setNumberOfPicks(int numberOfPicks) {
        this.numberOfPicks = numberOfPicks;
    }

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }
    @Override
    public String play(String soundOfInstrument) {
        return "Guitar music";
    }
}
