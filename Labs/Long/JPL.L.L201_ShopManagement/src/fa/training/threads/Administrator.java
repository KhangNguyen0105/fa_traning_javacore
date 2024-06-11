package fa.training.threads;

import java.util.List;

import fa.training.entities.OnlineShop;
import fa.training.entities.Product;

public class Administrator extends Thread {
    private List<Product> listOfProducts;
    private Product product;

    public Administrator(List<Product> lustOfProducts, Product product) {
        super();
        this.listOfProducts = lustOfProducts;
        this.product = product;
    }

    @Override
    public void run() {
        OnlineShop onlineShop = new OnlineShop(listOfProducts, product);
        onlineShop.add();
    }
}
