package models;

public class PerfumeryProduct extends Product {
    private int content;

    public PerfumeryProduct(String name, int content, int price) {
        super(name, price);
        this.content = content;
    }

    public int getContent() {
        return this.content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Contenido: " + this.getContent() + "ml /// Precio: $"
                + this.getPrice();
    }

}
