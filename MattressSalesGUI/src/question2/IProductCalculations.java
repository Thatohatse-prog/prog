package question2;

// This interface contains the methods
// used to calculate the product amounts.
public interface IProductCalculations {

    // Method to calculate VAT.
    double GetVat();

    // Method to calculate commission.
    double GetCommission();

    // Method to calculate the total sale amount.
    double GetTotal();

}