import java.time.LocalTime;

public class Compania extends Vuelos {
    // Variable que almacena el nombre de la compañía
    protected String nombreCompania;

    // Constructor que inicializa todas las variables de la clase base (Vuelos) y de esta clase (Compania)
    public Compania(String tipoVuelo, String codigo, String destino, String duracion, String plazas, String nombreCompania) {
        super(tipoVuelo, codigo, destino, duracion, plazas);  // Llama al constructor de la clase base (Vuelos)
        this.nombreCompania = nombreCompania;
    }

    // Método para obtener el nombre de la compañía
    public String getNombreCompania() {
        return nombreCompania;
    }

    // Método para establecer o cambiar el nombre de la compañía
    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    // Método para imprimir toda la información del vuelo y de la compañía
    public void imprimirInformacionV() {
        super.imprimirInformacionVuelos();  // Llama al método imprimirInformacionVuelos() de la clase base (Vuelos)
        System.out.println("Nombre Compañia: " + nombreCompania);
    }
}
