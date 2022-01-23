public class BassDrum extends AbstractInstrument implements ISell,IPlay{


    private int plyCount;
    public BassDrum(String material, String size, String colour, int _plyCount, int _buyingPrice, int _sellingPrice){
        super(material, size, colour, _buyingPrice, _sellingPrice);
        this.plyCount = _plyCount;



    }


    public int getPlyCount() {
        return plyCount;
    }

    @Override
    public int calculateMarkUp(int buyingPrice, int sellingPrice) {
        return sellingPrice-buyingPrice;
    }

    @Override
    public String play(String soundOfInstrument) {
        return "Bass Drum music";
    }


}
