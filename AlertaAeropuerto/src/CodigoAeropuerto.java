public class CodigoAeropuerto {
    protected String codigo;

    public CodigoAeropuerto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void ImprimirCodigo(){
        System.out.println("Codigo: "+codigo);
    }
}

