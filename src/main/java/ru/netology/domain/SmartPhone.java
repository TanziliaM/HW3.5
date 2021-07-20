package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SmartPhone extends Product {
    private String maker;

    public SmartPhone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "maker='" + maker + '\'' +
                '}';
    }
}






