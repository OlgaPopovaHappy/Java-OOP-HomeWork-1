public class HotDrink extends Product{
    protected int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
