package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculateTax(double subtotal) {
        String taxRateAsString = System.getProperty("tax.rate");
        double taxRate = Double.parseDouble(taxRateAsString);

        double tax = subtotal * taxRate;

        return tax;
    }
}
