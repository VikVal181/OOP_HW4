package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new BottleOfWater("Narzan", 50, 1),
                new Beer("Baltica", 44.5, 1),
                new Beer("Baltica", 33.5, 2));
        GeneralVendingMachine machine(products);



//        new BottleOfWater("Baltica", 59.5, 1),
//                new Chips("Lays", 80, 300, "Cheese")));




    }
}