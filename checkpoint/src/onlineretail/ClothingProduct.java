package onlineretail;

public class ClothingProduct extends Product{
    public String clothMaterial;
    public ClothingProduct(String name, double price, Integer quantity) {
        super(name, price, quantity);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
