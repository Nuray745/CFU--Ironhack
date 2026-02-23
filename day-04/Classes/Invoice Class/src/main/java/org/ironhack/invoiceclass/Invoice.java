package org.ironhack.invoiceclass;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        setPartNumber(partNumber);
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price =price;
    }

    public String getPartNumber() {
        return  partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPartNumber(String partNumber) {
        if(partNumber != null) {
            this.partNumber = partNumber;
        }else {
            this.partNumber = "";
        }
    }

    public void setPartDescription(String partDescription) {
        if(partDescription != null) {
            this.partDescription = partDescription;
        }else {
            this.partDescription = "";
        }
    }

    public void setPrice(double price) {
        if(price>0.0) {
            this.price = price;
        }else {
            this.price = 0.0;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
