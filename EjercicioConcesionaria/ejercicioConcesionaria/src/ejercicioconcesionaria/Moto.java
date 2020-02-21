package ejercicioconcesionaria;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {
    
    //Atributos
    private int cilindrada;
    
    //Constuctor
    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    //Método toString()
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo " + getModelo() +
                " // Cilindrada " + getCilindrada()+"c // Precio: $" + new DecimalFormat("###,###.00").format(getPrecio());
    }
    
    //Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
