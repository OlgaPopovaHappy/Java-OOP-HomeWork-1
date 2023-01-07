import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine());
        vm.add(new DrinksVendingMachine());

        for (VendingMachine el : vm) {
            el.restore();
        }*/

        Product drink = new HotDrink("Буратино",100,5);
        HotDrink drink1 = new HotDrink("Берёзовый сок",100,5);
        Product product = new HotDrink("Квас", 100,5);

        List<HotDrinkVendingMachine> hotDVM = new ArrayList<>();
        hotDVM.add(new HotDrinkVendingMachine());

        for (HotDrinkVendingMachine el : hotDVM) {
            el.getProduct();
        }
    }
}