public class Aeropuerto extends CodigoAeropuerto{
    protected  String nombre;
    protected  String poblacion;
    protected  String pais;
    protected  int GMT;

    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int GMT) {
        super(codigo);
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.GMT = GMT;
    }

    public int getGMT() {
        return GMT;
    }

    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirInformacion(){
        super.ImprimirCodigo();
        System.out.println("Nombre: "+nombre+ '\n' +"Poblacion: "+poblacion+'\n' +"Pais: "+pais+'\n' +"GTM: "+GMT);
    }
}
