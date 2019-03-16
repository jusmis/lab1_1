package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Objects;

public class Discount {
    private String discountCause;

    private Money discount;

    public Discount(String discountCause, Money discount) {
        this.discountCause = discountCause;
        this.discount = discount;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getDiscount() {
        return discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, discountCause);
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
        Discount other = (Discount) obj;
        return Objects.equals(discount, other.discount)
               && Objects.equals(discountCause, other.discountCause);
    }
}
