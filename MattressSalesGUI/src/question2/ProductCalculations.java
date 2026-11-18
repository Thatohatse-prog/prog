package question2;

// This class contains the product sales calculations.
public class ProductCalculations implements IProductCalculations {

    // Store the product price.
    private double price;

    // Constructor to receive the product price.
    public ProductCalculations(double price) {
        this.price = price;
    }

    // Calculate VAT at 15%.
    @Override
    public double GetVat() {
        return price * 0.15;
    }

    // Calculate commission at 5%.
    @Override
    public double GetCommission() {
        return price * 0.05;
    }

    // Calculate the total sale amount.
    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}