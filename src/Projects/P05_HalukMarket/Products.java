package Projects.P05_HalukMarket;

public class Products {
    private String productNo;
    private String productName;
    private String productPrice;
    private String productWeight;

    public Products() {

    }

    public Products(String productNo, String productName, String productPrice) {
        this.productNo = productNo;
        this.productName = productName;
        this.productPrice = productPrice;

    }

    public Products(String productNo, String productWeight) {
        this.productNo = productNo;
        this.productWeight = productWeight;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productWeight='" + productWeight + '\'' +
                '}';
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productQuantity) {
        this.productWeight = productQuantity;
    }
}
