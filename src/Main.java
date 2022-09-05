import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner imputNumbers = new Scanner(System.in);
        System.out.println("Enter the number of products you want in your shop:");
        int totalNumberOfProducts = imputNumbers.nextInt();
        System.out.println("Enter the number of products you want to add in your cart: ");
        int numberOfProductsMaxInCart = imputNumbers.nextInt();
        Customer customer = new Customer(numberOfProductsMaxInCart);
        Shop shop = new Shop(totalNumberOfProducts,customer);

        shop.populateProductsArray();
        shop.showProducts();
    }
}
