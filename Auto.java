public class Auto extends Vehiculo {
    private int numeroPuertas;
    private double sizeRuedas;
    private double capacidadMaletero;

    public Auto(String placa, String marca, String modelo, int year, double capacidadMotor, double capacidadTanque,
            double velocidadMax, String transimsion, double price, String estado, int numeroPuertas, double sizeRuedas,
            double capacidadMaletero) {
        super(placa, marca, modelo, year, capacidadMotor, capacidadTanque, velocidadMax, transimsion, price, estado);
        this.numeroPuertas = numeroPuertas;
        this.sizeRuedas = sizeRuedas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public double getSizeRuedas() {
        return sizeRuedas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Auto{" +
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
                ", numeroPuertas=" + numeroPuertas +
                ", sizeRuedas=" + sizeRuedas +
                ", capacidadMaletero=" + capacidadMaletero +
                '}';
    }

}
