import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido Usuario, ingrese los datos correspondientes a la venta");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        sc.nextLine();
        Cliente cliente = new Cliente(nombre, edad);

        System.out.println("Ingrese el número de la patente del vehículo: ");
        String patente = sc.nextLine();

        Vehiculo vehiculo = new Vehiculo(patente);

        System.out.println("Ingrese el nombre de la venta: ");
        String nombreVenta = sc.nextLine();
        System.out.println("Ingrese la fecha de la venta en formato dd/mm/aaaa");
        String fechaVenta = sc.nextLine();


        LibroVenta libroVenta = new LibroVenta(fechaVenta, nombreVenta);


        libroVenta.guardarVenta(cliente, vehiculo);
    }
}
