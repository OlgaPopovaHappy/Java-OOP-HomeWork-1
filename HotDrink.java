public class HotDrink extends Product{
    private int temperature;

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

    public String getProduct(String name, int temperature) {
        return String.format("Ваш напиток %s охлажден до %а",name,temperature);
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
