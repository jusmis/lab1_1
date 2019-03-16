package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;
import java.util.Objects;

public class ProductData {

    private String productId;

    private Money productPrice;

    private String productName;

    private Date productSnapshotDate;

    private String productType;

    public ProductData(String productId, Money productPrice, String productName, Date productSnapshotDate, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productSnapshotDate = productSnapshotDate;
        this.productType = productType;
    }

    public String getProductId() {
        return productId;
    }

    public Money getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, productSnapshotDate, productType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProductData other = (ProductData) obj;
        return Objects.equals(productId, other.productId)
               && Objects.equals(productName, other.productName)
               && Objects.equals(productPrice, other.productPrice)
               && Objects.equals(productSnapshotDate, other.productSnapshotDate)
               && Objects.equals(productType, other.productType);
    }
}
