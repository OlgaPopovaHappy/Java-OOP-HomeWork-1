
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {


    public HotDrinkVendingMachine() {
        System.out.println("вызван HotDrinkVendingMachine");
    }

    public void getProduct() {
        System.out.print("Ваш напиток. Наслаждайтесь!");
    }

    public void getProduct(String name) {
        System.out.printf("Ваш напиток - %s", name);
    }

}
