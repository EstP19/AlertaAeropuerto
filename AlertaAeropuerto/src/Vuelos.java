import java.time.LocalTime;

public class Vuelos extends CodigoAeropuerto {
    // Variables que almacenan el tipo de vuelo, destino, duración y plazas del vuelo
    protected String tipoVuelo;
    protected String destino;
    protected String duracion;
    protected String plazas;

    // Constructor que inicializa todas las variables del vuelo
    public Vuelos(String tipoVuelo, String codigo, String destino, String duracion, String plazas) {
        super(codigo);  // Llama al constructor de la clase base (CodigoAeropuerto)
        this.tipoVuelo = tipoVuelo;
        this.destino = destino;
        this.duracion = duracion;
        this.plazas = plazas;
    }

    // Método para obtener el destino del vuelo
    public String getDestino() {
        return destino;
    }

    // Método para establecer o cambiar el destino del vuelo
    public void setDestino(String destino) {
        this.destino = destino;
    }

    // Método para obtener las plazas del vuelo
    public String getPlazas() {
        return plazas;
    }

    // Método para establecer o cambiar las plazas del vuelo
    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    // Método para obtener la duración del vuelo
    public String getDuracion() {
        return duracion;
    }

    // Método para establecer o cambiar la duración del vuelo
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    // Método para imprimir toda la información del vuelo
    public void imprimirInformacionVuelos() {
        super.ImprimirCodigo();  // Llama al método ImprimirCodigo() de la clase base (CodigoAeropuerto)
        System.out.println("Tipo Vuelo: " + tipoVuelo + '\n' + "Destino: " + destino + '\n' + "Duracion: " + duracion + '\n' + "Plazas: " + plazas);
    }
}
