package br.com.mariojp.solid.srp;

public class ReceiptService {
    public String generate(Order order) {
        TaxCalculator tax = new TaxCalculator();
        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        double impostoCalculado = tax.calculateTax(subtotal);
        double total = subtotal + impostoCalculado;

        ReceiptFormatter receiptFormatter = new ReceiptFormatter();

        String resultado = receiptFormatter.formatter(subtotal, impostoCalculado, total, order);

        return resultado;
    }
}
