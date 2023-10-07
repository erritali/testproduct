package com.iut.produit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectronicProductTest {

    @Test
    public void testCalculatePrice() {
        // Créez une instance de ElectronicProduct avec un coût de 10.0 et une marque "Sony"
        ElectronicProduct electronicProduct = new ElectronicProduct("TV", 10.0, "Sony");

        // Appelez la méthode CalculatePrice
        double price = electronicProduct.CalculatePrice();

        // Vérifiez que le prix calculé est correct (10.0 * 2.0 + somme de 0 à 99)
        assertEquals(10.0 * 2.0 + calculateSum(0, 99), price);
    }

    @Test
    public void testGetBrand() {
        // Créez une instance de ElectronicProduct avec une marque "Apple"
        ElectronicProduct electronicProduct = new ElectronicProduct("Phone", 20.0, "Apple");

        // Appelez la méthode getBrand
        String brand = electronicProduct.getBrand();

        // Vérifiez que la marque retournée est correcte
        assertEquals("Apple", brand);
    }

    // Méthode utilitaire pour calculer la somme des entiers de start à end inclus
    private double calculateSum(int start, int end) {
        double sum = 0.0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
