package products;

public class Product {

    private String name;
    private Double price;
    private int amount;
    private ProductState state;

    public Product(String name, Double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;

        setAmount(amount);
        ProductsExtent.getInstance().addToProducts(this);
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public Boolean takeProduct() throws Exception {
        if (state == ProductState.LACK_OF_PRODUCT)
            throw new Exception("Lack of product: " + name);
        setAmount(--amount);
        return true;
    }

    private void setAmount(int amount) {
        this.amount = amount;
        if (amount == 0)
            state = ProductState.LACK_OF_PRODUCT;
        else
            state = ProductState.AVAILABLE;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public ProductState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Product:\n" +
                "\tName: " + name +
                "\n\tPrice: " + price +
                "\n\tAmount: " + amount +
                "\n\t" + state;
    }
}
