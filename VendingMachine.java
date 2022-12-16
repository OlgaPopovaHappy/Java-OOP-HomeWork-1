import java.util.List;

public class VendingMachine {

    /** возвращаемый метод - в VendingMachine инициализируем продукты из Product, SnacksProduct */
    void initProducts(List<Product> productList) {
        //Product product = productList.get(0); // достали первый элимент из листа Producta
        Product product1 = new Product("шоколад", 150);
        SnacksProduct product2 = new SnacksProduct("Chips", 1.0, 40,100);
    }

     public void restore() {
         System.out.println("Продукт выдан");

    }



}
