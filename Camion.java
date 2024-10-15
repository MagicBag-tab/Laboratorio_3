public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;
    private double sizeRuedas;

    public Camion(String placa, String marca, String modelo, int year, double capacidadMotor, double capacidadTanque,
            double velocidadMax, String transimsion, double price, String estado, double capacidadCarga, int numeroEjes,
            double sizeRuedas) {
        super(placa, marca, modelo, year, capacidadMotor, capacidadTanque, velocidadMax, transimsion, price, estado);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.sizeRuedas = sizeRuedas;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public double getSizeRuedas() {
        return sizeRuedas;
    }

    public String toString() {
        return "Camion{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", capacidadMotor=" + capacidadMotor +
                ", capacidadTanque=" + capacidadTanque +
                ", velocidadMax=" + velocidadMax +
                ", transmision='" + transmision + '\'' +
                ", price=" + price +
                ", estado='" + estado + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                ", sizeRuedas=" + sizeRuedas +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + capacidadCarga + "," + numeroEjes + "," + sizeRuedas;
    }
}
