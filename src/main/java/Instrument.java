public abstract class Instrument implements Sellable {
    private String modelName;
    private String color;
    private String material;
    private String body;
    private String keyboard;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String modelName, String color, String material, String body, String keyboard, double buyingPrice, double sellingPrice) {
        this.modelName = modelName;
        this.color = color;
        this.material = material;
        this.body = body;
        this.keyboard = keyboard;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getBody() {
        return body;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }


    public double getMarkUp(){

    sellingPrice -buyingPrice;
    return markUp();
    }
}



