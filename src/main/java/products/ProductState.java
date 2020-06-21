package products;

public enum ProductState {

    LACK_OF_PRODUCT("Lack of product"),
    AVAILABLE("Available");

    private String name;

    ProductState(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductState: " + name;
    }
}
