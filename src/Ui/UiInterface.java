package Ui;
import java.util.ArrayList;

import models.BeverageProduct;
import models.PerfumeryProduct;
import models.Product;
import models.WeighableProduct;

public class UiInterface {

    static ArrayList<Product> productsList = new ArrayList<>();

    private static void showProductsList() {

        // creo instancias de Product, instanciando sus clases hijas
        Product cocaColaZero = new BeverageProduct("Coca-Cola Zero", 1.5, 20);
        Product cocaCola = new BeverageProduct("Coca-Cola ", 1.5, 18);
        Product shampooSedal = new PerfumeryProduct("Shampoo Sedal", 900, 19);
        Product frutillas = new WeighableProduct("Frutillas", "kilo", 64);

        // agrego los productos a la lista
        productsList.add(cocaColaZero);
        productsList.add(cocaCola);
        productsList.add(shampooSedal);
        productsList.add(frutillas);

        // itero la lista de productos y imprimo en la consola los datos requeridos
        // sobrecargados en el metodo toString()
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }

    // defino funcion que itera lista de productos recibida por parametro que
    // recupera el maximo y minimo producto con respecto a su precio
    // la funcion imprime dichos valores
    private static void showMaxMinProductList(ArrayList<Product> list) {
        Product minPriceProduct = list.get(0);
        Product maxPriceProduct = list.get(0);

        for (Product product : list) {
            if (product.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
            if (product.getPrice() < minPriceProduct.getPrice()) {
                minPriceProduct = product;
            }
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + maxPriceProduct.getName());
        System.out.println("Producto más barato: " + minPriceProduct.getName());

    }

    public static void ShowProductsData() {
        showProductsList();
        showMaxMinProductList(productsList);

    }

}
