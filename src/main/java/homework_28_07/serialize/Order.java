package homework_28_07.serialize;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Order implements Serializable {
    private long userId;


    private transient Map<Product, Integer> products;

    private Date creationDate;


    public Order(long userId, Map<Product, Integer> products, Date creationDate) {
        this.userId = userId;
        this.products = products;
        this.creationDate = creationDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", products=" + products +
                ", creationDate=" + creationDate +
                '}';
    }
}
