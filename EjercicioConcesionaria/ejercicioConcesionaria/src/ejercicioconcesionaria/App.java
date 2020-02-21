package ejercicioconcesionaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.text.DecimalFormat;

public class App {

    public static List<Vehiculo>getVehiculos(){
        List<Vehiculo>vehiculos = new ArrayList();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
        vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
        vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.5));
        
        return vehiculos;
    }
        
    public static void main(String[] args) {
        
        //Imprimir todos los vehículos:
        getVehiculos().forEach(System.out::println);
        
        System.out.println("=========================================================");
        
        //Imprimir el vehículo más caro:
        Vehiculo precioMax = getVehiculos()
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más caro: " + precioMax.getMarca()+ " " + precioMax.getModelo());
        
        //Imprimir el vehículo mas barato:
        Vehiculo precioMin = getVehiculos()
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más barato: " + precioMin.getMarca() + " " + precioMin.getModelo());
        
        //Vehículo que contiene en el modelo la letra ‘Y’
        Vehiculo contieneY = getVehiculos()
                .stream()
                .filter(v -> v.getModelo().contains("Y"))
                .findAny()
                .get();
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " 
                + contieneY.getMarca() + " " + contieneY.getModelo() + " $" + new DecimalFormat("###,###.00").format(contieneY.getPrecio()));
               
        System.out.println("=========================================================");
        
        //Vehículos ordenados por precio de mayor a menor:
        getVehiculos()
                .stream()
                .sorted().forEach(v ->System.out.println(v.getMarca() + " " + v.getModelo()));
    }
}
