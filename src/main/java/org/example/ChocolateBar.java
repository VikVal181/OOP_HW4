package org.example;

public class ChocolateBar extends Product{
    private int weight;


    public ChocolateBar(String name, double cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ChocolateBar{" +
                "name='" + super.getName() + '\'' +
                "weight='" + this.weight + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChocolateBar)) {
            return false;
        }

        ChocolateBar that = (ChocolateBar) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getWeight() == that.getWeight();
    }
}
