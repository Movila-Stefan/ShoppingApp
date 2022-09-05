public class Customer {

    private int maxProducts;
    private Product[] cart;
    private double cartValue;

    public Customer(int maxProducts) {
        this.maxProducts = maxProducts;
        cart = new Product[maxProducts];
    }

    public int getMaxProducts() {
        return maxProducts;
    }

    public void setMaxProducts(int maxProducts) {
        this.maxProducts = maxProducts;
    }

    public Product[] getCart() {
        return cart;
    }

    public void setCart(Product[] cart) {
        this.cart = cart;
    }

    public double getCartValue() {
        return cartValue;
    }

    public void setCartValue(double cartValue) {
        this.cartValue = cartValue;
    }
}
