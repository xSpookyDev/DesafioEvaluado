public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String fechaVenta, String nombreVenta) {
        this.fechaVenta = fechaVenta;
        this.nombreVenta = nombreVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {

        java.io.File directorio = new java.io.File("ficheros");
        if (!directorio.exists()) {
            directorio.mkdir();
        }


        String nombreArchivo = "ficheros/" + nombreVenta + ".txt";


        java.io.File archivo = new java.io.File(nombreArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo ya existe. No se puede sobrescribir.");
            return;
        }


        try (java.io.FileWriter writer = new java.io.FileWriter(archivo)) {
            writer.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
            writer.write("Nombre del cliente: " + cliente.getNombre() + "\n");
            writer.write("Edad del cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la venta: " + fechaVenta + "\n");
            writer.write("Nombre de la venta: " + nombreVenta + "\n");
            System.out.println("Venta guardada exitosamente.");
        } catch (java.io.IOException e) {
            System.out.println("Ocurrió un error al guardar la venta: " + e.getMessage());
        }
    }
}
