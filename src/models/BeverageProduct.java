package models;

public class BeverageProduct extends Product {
    private double liters;

    public BeverageProduct (String name, double liters, int price){
        super(name, price);
        this.liters = liters;
    }


    public double getLiters() {
        return this.liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getName() + " /// Litros: " + this.getLiters() + " /// Precio: $" + this.getPrice();
    }
}
