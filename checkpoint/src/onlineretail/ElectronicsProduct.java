package onlineretail;

public class ElectronicsProduct extends Product{
    public String electronicMaterial;
    public ElectronicsProduct(String name, double price, Integer quantity) {
        super(name, price, quantity);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
