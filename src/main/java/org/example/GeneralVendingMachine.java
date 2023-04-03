package org.example;

import java.util.List;

public class GeneralVendingMachine <T extends Product > implements VendingMachine{
    private List<T> products;

    public GeneralVendingMachine(List<T> products) {
        this.products = products;
    }

    public T getProduct(String name){
        for(T product: products) {
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
    public T getProduct(String name, int volume){
        for(T product: products) {
            if (product instanceof Beer || product instanceof BottleOfWater) {
                if(product.getName().equalsIgnoreCase(name) && product.getVolume() == volume){
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}

