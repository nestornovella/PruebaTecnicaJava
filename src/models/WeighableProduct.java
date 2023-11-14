package models;

public class WeighableProduct extends Product {
    private String salesUnit;

    public WeighableProduct(String name, String salesUnit, int price) {
        super(name, price);
        this.salesUnit = salesUnit;
    }

    public String getSalesUnit() {
        return this.salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Precio: $" + this.getPrice() + " /// Unidad de venta: "
                + this.getSalesUnit();
    }

}
