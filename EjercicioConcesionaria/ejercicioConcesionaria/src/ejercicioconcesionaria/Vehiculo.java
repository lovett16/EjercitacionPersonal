package ejercicioconcesionaria;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    
    //Atributos
    private String marca;
    private String modelo;
    private double precio;
    
    //Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Método compateTo()
    @Override
    public int compareTo(Vehiculo v){
        if(precio > v.getPrecio()){
            return -1;
        }
        if(precio < v.getPrecio()){
            return 1;
        }
        else return 0;
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
