package org.ironhack.invoiceclass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Invoice invoice = new Invoice("A100", "Hammer", 5, 12.50);
        System.out.println("Amount: " + invoice.getInvoiceAmount());

        Invoice invalid = new Invoice(null, null, -3, -10.0);
        System.out.println("Amount: " + invalid.getInvoiceAmount());
    }
}