import java.io.*;
import java.util.ArrayList;

public class Concesionario {
    private String archivoAuto = "data/autos.csv";
    private String archivoMoto = "data/motos.csv";
    private String archivoCamion = "data/camiones.csv";

    private ArrayList<Auto> autos;
    private ArrayList<Motocicleta> motos;
    private ArrayList<Camion> camiones;

    public Concesionario() {
        this.autos = new ArrayList<>();
        this.motos = new ArrayList<>();
        this.camiones = new ArrayList<>();
        cargarAutos();
        cargarMotocicletas();
        cargarCamiones();
    }

    // Métodos de carga desde CSV
    private void cargarAutos() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoAuto))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Auto auto = new Auto(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]),
                        Double.parseDouble(datos[4]), Double.parseDouble(datos[5]), Double.parseDouble(datos[6]),
                        datos[7], Double.parseDouble(datos[8]), datos[9], Integer.parseInt(datos[10]),
                        Double.parseDouble(datos[11]), Double.parseDouble(datos[12]));
                autos.add(auto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarMotocicletas() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoMoto))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Motocicleta moto = new Motocicleta(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]),
                        Double.parseDouble(datos[4]), Double.parseDouble(datos[5]), Double.parseDouble(datos[6]),
                        datos[7], Double.parseDouble(datos[8]), datos[9], datos[10], Double.parseDouble(datos[11]));
                motos.add(moto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarCamiones() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCamion))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Camion camion = new Camion(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]),
                        Double.parseDouble(datos[4]), Double.parseDouble(datos[5]), Double.parseDouble(datos[6]),
                        datos[7], Double.parseDouble(datos[8]), datos[9], Double.parseDouble(datos[10]),
                        Integer.parseInt(datos[11]), Double.parseDouble(datos[12]));
                camiones.add(camion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Métodos para guardar datos en CSV
    public void guardarDatos() {
        guardarAutos();
        guardarMotocicletas();
        guardarCamiones();
    }

    private void guardarAutos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoAuto))) {
            for (Auto auto : autos) {
                bw.write(auto.getPlaca() + "," + auto.getMarca() + "," + auto.getModelo() + "," + auto.getYear() + ","
                        + auto.getCapacidadMotor() + "," + auto.getCapacidadTanque() + "," + auto.getVelocidadMax()
                        + ","
                        + auto.getTransmision() + "," + auto.getPrice() + "," + auto.getEstado() + ","
                        + auto.getNumeroPuertas()
                        + "," + auto.getSizeRuedas() + "," + auto.getCapacidadMaletero());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarMotocicletas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoMoto))) {
            for (Motocicleta moto : motos) {
                bw.write(moto.getPlaca() + "," + moto.getMarca() + "," + moto.getModelo() + "," + moto.getYear() + ","
                        + moto.getCapacidadMotor() + "," + moto.getCapacidadTanque() + "," + moto.getVelocidadMax()
                        + ","
                        + moto.getTransmision() + "," + moto.getPrice() + "," + moto.getEstado() + ","
                        + moto.getTipoMoto()
                        + "," + moto.getSizeRuedas());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarCamiones() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCamion))) {
            for (Camion camion : camiones) {
                bw.write(camion.getPlaca() + "," + camion.getMarca() + "," + camion.getModelo() + "," + camion.getYear()
                        + ","
                        + camion.getCapacidadMotor() + "," + camion.getCapacidadTanque() + ","
                        + camion.getVelocidadMax() + ","
                        + camion.getTransmision() + "," + camion.getPrice() + "," + camion.getEstado() + ","
                        + camion.getCapacidadCarga() + "," + camion.getNumeroEjes() + "," + camion.getSizeRuedas());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Métodos de gestión (agregar, eliminar, buscar)
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void agregarMotocicleta(Motocicleta moto) {
        motos.add(moto);
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }

    public boolean eliminarVehiculo(String placa) {
        return autos.removeIf(a -> a.getPlaca().equals(placa)) ||
                motos.removeIf(m -> m.getPlaca().equals(placa)) ||
                camiones.removeIf(c -> c.getPlaca().equals(placa));
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Auto auto : autos) {
            if (auto.getPlaca().equals(placa)) {
                return auto;
            }
        }
        for (Motocicleta moto : motos) {
            if (moto.getPlaca().equals(placa)) {
                return moto;
            }
        }
        for (Camion camion : camiones) {
            if (camion.getPlaca().equals(placa)) {
                return camion;
            }
        }
        return null;
    }

    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    public ArrayList<Motocicleta> listarMotocicletas() {
        return motos;
    }

    public ArrayList<Camion> listarCamiones() {
        return camiones;
    }

    public int contarVehiculosPorEstado(String estado) {
        int total = 0;
        total += autos.stream().filter(a -> a.getEstado().equalsIgnoreCase(estado)).count();
        total += motos.stream().filter(m -> m.getEstado().equalsIgnoreCase(estado)).count();
        total += camiones.stream().filter(c -> c.getEstado().equalsIgnoreCase(estado)).count();
        return total;
    }

    public double calcularMontoTotalPorEstado(String estado) {
        double total = 0;
        total += autos.stream().filter(a -> a.getEstado().equalsIgnoreCase(estado))
                .mapToDouble(Auto::getPrice).sum();
        total += motos.stream().filter(m -> m.getEstado().equalsIgnoreCase(estado))
                .mapToDouble(Motocicleta::getPrice).sum();
        total += camiones.stream().filter(c -> c.getEstado().equalsIgnoreCase(estado))
                .mapToDouble(Camion::getPrice).sum();
        return total;
    }
}