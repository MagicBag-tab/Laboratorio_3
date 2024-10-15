import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Scanner scanner = new Scanner(System.in);
        int op;

        System.out.println("Menú de Concesionario");
        System.out.println("1. Listar vehículos por categoría");
        System.out.println("2. Buscar vehículo por placa");
        System.out.println("3. Agregar un vehículo");
        System.out.println("4. Eliminar un vehículo por placa");
        System.out.println("5. Mostrar estado de los vehículos");
        System.out.println("6. Calcular monto total por estado");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        op = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        while (op != 0) {

            switch (op) {
                case 1:
                    listarVehiculos(concesionario, scanner);
                    break;
                case 2:
                    buscarVehiculo(concesionario, scanner);
                    break;
                case 3:
                    agregarVehiculo(concesionario, scanner);
                    break;
                case 4:
                    eliminarVehiculo(concesionario, scanner);
                    break;
                case 5:
                    mostrarEstadoVehiculos(concesionario);
                    break;
                case 6:
                    calcularMontoPorEstado(concesionario, scanner);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema de concesionario!");
                    concesionario.guardarDatos(); // Guardar los datos antes de salir
                    break;
                default:
                    System.out.println("Opción inválida, ingrese una opción válida");
            }

            System.out.println("Menú de Concesionario");
            System.out.println("1. Listar vehículos por categoría");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Agregar un vehículo");
            System.out.println("4. Eliminar un vehículo por placa");
            System.out.println("5. Mostrar estado de los vehículos");
            System.out.println("6. Calcular monto total por estado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            op = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
        }

        scanner.close();
    }

    private static void listarVehiculos(Concesionario concesionario, Scanner scanner) {
        System.out.println("\n--- Listar vehículos por categoría ---");
        System.out.println("1. Autos");
        System.out.println("2. Motocicletas");
        System.out.println("3. Camiones");
        System.out.print("Seleccione una categoría: ");
        int categoria = scanner.nextInt();

        switch (categoria) {
            case 1:
                System.out.println("Listado de Autos:");
                for (Auto auto : concesionario.listarAutos()) {
                    System.out.println(auto);
                }
                break;
            case 2:
                System.out.println("Listado de Motocicletas:");
                for (Motocicleta moto : concesionario.listarMotocicletas()) {
                    System.out.println(moto);
                }
                break;
            case 3:
                System.out.println("Listado de Camiones:");
                for (Camion camion : concesionario.listarCamiones()) {
                    System.out.println(camion);
                }
                break;
            default:
                System.out.println("Categoría no válida.");
        }
    }

    private static void buscarVehiculo(Concesionario concesionario, Scanner scanner) {
        System.out.println("\n--- Buscar vehículo por placa ---");
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        Vehiculo vehiculo = concesionario.buscarVehiculo(placa);

        if (vehiculo != null) {
            System.out.println("Detalles del vehículo encontrado:");
            System.out.println(vehiculo);
        } else {
            System.out.println("No se encontró ningún vehículo con la placa ingresada.");
        }
    }

    private static void agregarVehiculo(Concesionario concesionario, Scanner scanner) {
        System.out.println("\n--- Agregar un vehículo ---");
        System.out.println("1. Auto");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camión");
        System.out.print("Seleccione el tipo de vehículo a agregar: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Año: ");
        int year = scanner.nextInt();
        System.out.print("Capacidad del motor: ");
        double capacidadMotor = scanner.nextDouble();
        System.out.print("Capacidad del tanque: ");
        double capacidadTanque = scanner.nextDouble();
        System.out.print("Velocidad máxima: ");
        double velocidadMax = scanner.nextDouble();
        scanner.nextLine(); // Consumir nueva línea
        System.out.print("Transmisión: ");
        String transmision = scanner.nextLine();
        System.out.print("Precio: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consumir nueva línea
        System.out.print("Estado (Disponible/Reservado/Vendido): ");
        String estado = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Número de puertas: ");
                int numeroPuertas = scanner.nextInt();
                System.out.print("Tamaño de ruedas: ");
                double sizeRuedasAuto = scanner.nextDouble();
                System.out.print("Capacidad del maletero: ");
                double capacidadMaletero = scanner.nextDouble();
                Auto auto = new Auto(placa, marca, modelo, year, capacidadMotor, capacidadTanque, velocidadMax,
                        transmision, price, estado, numeroPuertas, sizeRuedasAuto, capacidadMaletero);
                concesionario.agregarAuto(auto);
                concesionario.guardarDatos();
                System.out.println("Auto agregado exitosamente.");
                break;
            case 2:
                System.out.print("Tipo de moto: ");
                String tipoMoto = scanner.nextLine();
                System.out.print("Tamaño de ruedas: ");
                double sizeRuedasMoto = scanner.nextDouble();
                Motocicleta moto = new Motocicleta(placa, marca, modelo, year, capacidadMotor, capacidadTanque,
                        velocidadMax, transmision, price, estado, tipoMoto, sizeRuedasMoto);
                concesionario.agregarMotocicleta(moto);
                concesionario.guardarDatos();
                System.out.println("Motocicleta agregada exitosamente.");
                break;
            case 3:
                System.out.print("Capacidad de carga: ");
                double capacidadCarga = scanner.nextDouble();
                System.out.print("Número de ejes: ");
                int numeroEjes = scanner.nextInt();
                System.out.print("Tamaño de ruedas: ");
                double sizeRuedasCamion = scanner.nextDouble();
                Camion camion = new Camion(placa, marca, modelo, year, capacidadMotor, capacidadTanque, velocidadMax,
                        transmision, price, estado, capacidadCarga, numeroEjes, sizeRuedasCamion);
                concesionario.agregarCamion(camion);
                concesionario.guardarDatos();
                System.out.println("Camión agregado exitosamente.");
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
        }
    }

    private static void eliminarVehiculo(Concesionario concesionario, Scanner scanner) {
        System.out.println("\n--- Eliminar un vehículo por placa ---");
        System.out.print("Ingrese la placa del vehículo a eliminar: ");
        String placa = scanner.nextLine();
        boolean eliminado = concesionario.eliminarVehiculo(placa);

        if (eliminado) {
            System.out.println("Vehículo eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún vehículo con la placa ingresada.");
        }
    }

    private static void mostrarEstadoVehiculos(Concesionario concesionario) {
        System.out.println("\n--- Mostrar estado de los vehículos ---");
        System.out.println("Disponibles: " + concesionario.contarVehiculosPorEstado("Disponible"));
        System.out.println("Reservados: " + concesionario.contarVehiculosPorEstado("Reservado"));
        System.out.println("Vendidos: " + concesionario.contarVehiculosPorEstado("Vendido"));
    }

    private static void calcularMontoPorEstado(Concesionario concesionario, Scanner scanner) {
        System.out.println("\n--- Calcular monto total por estado ---");
        System.out.print("Ingrese el estado (Disponible/Reservado/Vendido): ");
        String estado = scanner.nextLine();
        double montoTotal = concesionario.calcularMontoTotalPorEstado(estado);
        System.out.println("El monto total de los vehículos en estado '" + estado + "' es: Q" + montoTotal);
    }
}
