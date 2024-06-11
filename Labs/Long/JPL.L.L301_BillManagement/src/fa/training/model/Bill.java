package fa.training.model;

import java.io.Serializable;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    private String billCode;
    private String customerName;
    private String createDate;
    private float discount;
    private double totalPrice;

    public Bill() {

    }

    public Bill(String billCode, String customerName, String createDate, float discount, double totalPrice) {
        this.billCode = billCode;
        this.customerName = customerName;
        this.createDate = createDate;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBillCode() {
        return billCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public float getDiscount() {
        return discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Bill [billCode=" + billCode + ", customerName=" + customerName +
            ", createDate=" + createDate + ", discount=" + discount + 
            ", totalPrice=" + totalPrice + "]";
    }
}
