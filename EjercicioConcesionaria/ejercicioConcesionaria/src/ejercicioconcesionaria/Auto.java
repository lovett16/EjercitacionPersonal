package ejercicioconcesionaria;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {
    
    //Atributos
    private int puertas;
    
    //Constructor
    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    //Método toString()
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + 
                " // Puertas: " + getPuertas() + " // Precio: $" + new DecimalFormat ("###,###.00").format(getPrecio());
    }
    
    //Getters y Setters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
