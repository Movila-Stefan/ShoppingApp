import java.security.PublicKey;
import java.util.Scanner;

public class Shop {

    private int numberOfProducts;
    private Product[] arrayProducts;
    private Customer customer;
    private Scanner imputNumbers = new Scanner(System.in);

    private Scanner imputText = new Scanner(System.in);


    public Shop(int numberOfProducts, Customer customer) {
        this.numberOfProducts = numberOfProducts;
        this.customer = customer;
        arrayProducts = new Product[numberOfProducts];
    }
    public void populateProductsArray(){
        System.out.println("Enter all products in the shop");
        int var = 1;
        for (int i = 0; i < arrayProducts.length ; i++) {
            System.out.println("Add the product number " + var + ": ");
            System.out.println("Enter Name: ");
            String nume = imputText.nextLine();
            System.out.println("Enter Price: ");
            double price = imputNumbers.nextDouble();
            Product product = new Product(nume,price);
            arrayProducts[i] = product;
            var++;
        }
    }

    public  void showProducts(){
        System.out.println("The products Are: ");
        int var = 1;
        for (int i = 0; i < arrayProducts.length ; i++) {
            Product curentProd=arrayProducts[i];
            System.out.println("product : " +var+ " Nume : " +curentProd.getName()+ " Price : " +curentProd.getPrice() );
        }
    }









    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public Product[] getArrayProducts() {
        return arrayProducts;
    }

    public void setArrayProducts(Product[] arrayProducts) {
        this.arrayProducts = arrayProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
