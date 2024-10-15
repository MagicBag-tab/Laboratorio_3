public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int year;
    protected double capacidadMotor;
    protected double capacidadTanque;
    protected double velocidadMax;
    protected String transmision;
    protected double price;
    protected String estado;

    public Vehiculo(String placa, String marca, String modelo, int year, double capacidadMotor, double capacidadTanque,
            double velocidadMax, String transimsion, double price, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.capacidadMotor = capacidadMotor;
        this.capacidadTanque = capacidadTanque;
        this.transmision = transimsion;
        this.price = price;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public String getTransmision() {
        return transmision;
    }

    public double getPrice() {
        return price;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
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
                '}';
    }

    public String toCSV() {
        return placa + "," + marca + "," + modelo + "," + year + "," +
                capacidadMotor + "," + capacidadTanque + "," + velocidadMax + "," +
                transmision + "," + price + "," + estado;
    }

}