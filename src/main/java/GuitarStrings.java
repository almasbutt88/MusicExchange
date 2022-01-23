public class GuitarStrings extends AbstractInstrument implements ISell{

    String _material;
    String thickness;
    String _colour;
        int length;

        public GuitarStrings(String _material, String _thickness, String _colour, int _length, int _buyingPrice, int _sellingPrice){
            super(_material, _thickness, _colour, _buyingPrice, _sellingPrice);
            this.length = _length;
        }

    public String get_material() {
        return _material;
    }

    public void set_material(String _material) {
        this._material = _material;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
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
