public class Motocicleta extends Vehiculo {
    private String tipoMoto;
    private double sizeRuedas;

    public Motocicleta(String placa, String marca, String modelo, int year, double capacidadMotor,
            double capacidadTanque,
            double velocidadMax, String transimsion, double price, String estado, String tipoMoto, double sizeRuedas) {
        super(placa, marca, modelo, year, capacidadMotor, capacidadTanque, velocidadMax, transimsion, price, estado);
        this.tipoMoto = tipoMoto;
        this.sizeRuedas = sizeRuedas;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public double getSizeRuedas() {
        return sizeRuedas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
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
                ", tipoMoto='" + tipoMoto + '\'' +
                ", sizeRuedas=" + sizeRuedas +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + tipoMoto + "," + sizeRuedas;
    }

}
