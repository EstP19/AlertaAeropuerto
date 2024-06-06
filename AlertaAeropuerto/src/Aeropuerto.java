public class Aeropuerto extends CodigoAeropuerto {
    // Variables que almacenan el nombre, población, país y GMT del aeropuerto
    protected String nombre;
    protected String poblacion;
    protected String pais;
    protected int GMT;

    // Constructor que inicializa todas las variables del aeropuerto
    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int GMT) {
        super(codigo);  // Llama al constructor de la clase base (CodigoAeropuerto)
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.GMT = GMT;
    }

    // Método para obtener el GMT del aeropuerto
    public int getGMT() {
        return GMT;
    }

    // Método para establecer o cambiar el GMT del aeropuerto
    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    // Método para obtener el país del aeropuerto
    public String getPais() {
        return pais;
    }

    // Método para establecer o cambiar el país del aeropuerto
    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método para obtener la población del aeropuerto
    public String getPoblacion() {
        return poblacion;
    }

    // Método para establecer o cambiar la población del aeropuerto
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    // Método para obtener el nombre del aeropuerto
    public String getNombre() {
        return nombre;
    }

    // Método para establecer o cambiar el nombre del aeropuerto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para imprimir toda la información del aeropuerto
    public void imprimirInformacion() {
        super.ImprimirCodigo();  // Llama al método ImprimirCodigo() de la clase base (CodigoAeropuerto)
        System.out.println("Nombre: " + nombre + '\n' + "Poblacion: " + poblacion + '\n' + "Pais: " + pais + '\n' + "GTM: " + GMT);
    }
}
