public class SnacksProduct extends Product{
    protected String name;
    protected double price;
    private double weight;
    private double volume;

    public SnacksProduct(String name, double price,double weight, double volume) {
        super(name, price);
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public double getVolume() {
        return volume;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
}

