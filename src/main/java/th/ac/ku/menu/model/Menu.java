package th.ac.ku.menu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

// Entity เมื่อ run จะสร้างตารางอัตโนมัติ
@Entity
public class Menu {

    @Id // ใช้ set primary key
    @GeneratedValue
    private UUID id;

    // คอลัมน์
    private String name;
    private double price;
    private String category;

    //  ให้ Generate..
    //       - Getters และ Setters ทั้งหมด


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

