package ss16_io_binary_file_and_serialization.bai_tap.manager_product;

public class Product {
    private String productID;
    private String productName;
    private String productCompany;
    private int price;
    private String moreDescription;

    public Product() {
    }

    public Product(String productID, String productName, String productCompany, int price, String moreDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productCompany = productCompany;
        this.price = price;
        this.moreDescription = moreDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMoreDescription() {
        return moreDescription;
    }

    public void setMoreDescription(String moreDescription) {
        this.moreDescription = moreDescription;
    }

    @Override
    public String toString() {
        return "Product = " +
                "Product ID: " + productID +
                ", Product Name: " + productName +
                ", Product Company: " + productCompany +
                ", Price: " + price +
                ", More Description: " + moreDescription +
                '.';
    }

    public String getInfo() {
        return productID + ", " + productName + ", " + productCompany + ", " + price + ", " + moreDescription + ".";
    }
}
