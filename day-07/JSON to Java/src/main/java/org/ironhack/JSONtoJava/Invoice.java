package org.ironhack.JSONtoJava;

import java.util.List;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    private List<InvoiceItem> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> InvoiceItem) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = InvoiceItem;
    }


}
