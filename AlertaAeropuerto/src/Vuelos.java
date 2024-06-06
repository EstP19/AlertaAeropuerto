import java.time.LocalTime;

public class Vuelos extends CodigoAeropuerto{
    protected String tipoVuelo;
    protected String destino;
    protected String duracion;
    protected String plazas;


    public Vuelos(String tipoVuelo, String codigo, String destino, String duracion, String plazas) {
        super(codigo);
        this.tipoVuelo = tipoVuelo;
        this.destino = destino;
        this.duracion = duracion;
        this.plazas = plazas;


    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlazas() {
        return plazas;
    }

    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public void imprimirInformacionVuelos(){
        super.ImprimirCodigo();
        System.out.println("Tipo Vuelo: "+tipoVuelo+'\n' +"Destino: "+destino+'\n' +"Duracion: "+duracion+'\n' +"Plazas: "+plazas);
    }
}
