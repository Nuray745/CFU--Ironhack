package org.ironhack.JSONtoJava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InvoiceItem> invoiceItems = List.of(
                new InvoiceItem("Coca Cola 2L", 10.0),
                new InvoiceItem("Rum Santa Teresa 0.7L", 15.0),
                new InvoiceItem("Ice bag L", 5.5)
        );

        Invoice invoice = new Invoice("YMZ-0000001", 30.5, false, invoiceItems);
        System.out.println("Invoice created successfully!");
    }

}
