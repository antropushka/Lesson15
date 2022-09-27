package by.epam.dragons.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int price;

    public Treasure() {
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Treasure)) return false;
        Treasure treasure = (Treasure) o;
        return getPrice() == treasure.getPrice() && Objects.equals(getName(), treasure.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
