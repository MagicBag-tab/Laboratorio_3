import java.util.ArrayList;

public class Concesionario {
    private String archivoAuto = "data/autos.csv";
    private String archivoMoto = "data/autos.csv";
    private String archivoCamion = "data/autos.csv";

    private ArrayList<Auto> autos;
    private ArrayList<Motocicleta> motos;
    private ArrayList<Camion> camiones;

    public Concesionario() {
        this.autos = new ArrayList<>();
        this.motos = new ArrayList<>();
        this.camiones = new ArrayList<>();
    }

}
