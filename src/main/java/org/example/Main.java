package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfWater listWaters = new ListOfWater();
        listWaters.setListWater(Arrays.asList(
                new BottleOfWater("Sviatoy istochnik", 50, 2),
                new BottleOfWater("Fruto niania", 80, 0.5),
                new BottleOfWater("Bon Aqua", 54, 1)));
        GeneralVendingMachine <BottleOfWater> waterMachine = new GeneralVendingMachine<>(listWaters.getListWater());
        System.out.println(waterMachine.getProduct("Bon Aqua"));
        ListOfBeer listBeers = new ListOfBeer();
        listBeers.setListBeer(Arrays.asList(
                new Beer("Amstel", 80, 1),
                new Beer("Baltica", 44.5, 1),
                new Beer("Nevskoe", 120.5, 2)));
        GeneralVendingMachine <Beer> beerMachine = new GeneralVendingMachine<>(listBeers.getListBeer());
        System.out.println(beerMachine.getProduct("Baltica"));
        ListOfChips listChips= new ListOfChips();
        listChips.setListChips(Arrays.asList(
                new Chips("Lays", 70, 100, "Onion"),
                new Chips("Russkaia Kortoshka", 30, 150, "Chicken"),
                new Chips("Pringles", 250, 200,"Pepper")));
        GeneralVendingMachine <Chips> chipsMachine = new GeneralVendingMachine<>(listChips.getListChips());
        System.out.println(chipsMachine.getProduct("Pringles"));
    }
}

