public class CodigoAeropuerto {
    // Variable que almacena el código del aeropuerto
    protected String codigo;

    // Constructor que inicializa el código del aeropuerto
    public CodigoAeropuerto(String codigo) {
        this.codigo = codigo;
    }

    // Método para obtener el código del aeropuerto
    public String getCodigo() {
        return codigo;
    }

    // Método para establecer o cambiar el código del aeropuerto
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para imprimir el código del aeropuerto
    public void ImprimirCodigo() {
        System.out.println("Codigo: " + codigo);
    }
}
