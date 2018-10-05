public abstract class Instrument implements Sellable {
    private String modelName;
    private String color;
    private String material;
    private String body;
    private String keyboard;


    public Instrument(String modelName, String color, String material, String body, String keyboard) {
        this.modelName = modelName;
        this.color = color;
        this.material = material;
        this.body = body;
        this.keyboard = keyboard;

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


}



