import java.util.ArrayList;
import java.util.List;

public class agregarInformacion {
    private final List<Aeropuerto> aeropuertos = new ArrayList<>();
    private final List<Compania> companias = new ArrayList<>();



    public agregarInformacion() {

    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public List<Compania> getCompanias() {
        return companias;
    }


    public void agregarAeropuertos(Aeropuerto aeropuerto) {
        aeropuertos.add(aeropuerto);
    }

    public void imprimirInformacionAeropuertos() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            aeropuerto.imprimirInformacion();
            System.out.println();
        }
    }
    public void agregarVuelo(Compania compania) {
        companias.add(compania);
    }

    public void imprimirInformacionVuelos() {
        for (Compania compania : companias) {
            compania.imprimirInformacionV();
            System.out.println();
        }
    }

    private Aeropuerto buscarAeropuertoPorCodigo(String codigo) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCodigo().equals(codigo)) {
                return aeropuerto;
            }
        }
        return null;
    }

    public void mostrarVuelosSalidaPorAeropuerto(String codigoAeropuerto) {
        Aeropuerto aeropuerto = buscarAeropuertoPorCodigo(codigoAeropuerto);
        if (aeropuerto != null) {
            System.out.println("Vuelos de salida desde el aeropuerto " + codigoAeropuerto + ": " + aeropuerto.getNombre());
        for (Compania compania : companias ) {
            if (compania.getCodigo().equals(codigoAeropuerto)) {
                compania.imprimirInformacionV();
                System.out.println();
            }
        }}
        System.out.println();
    }

    public void mostrarVuelosllegadaPorAeropuerto(String codigoAeropuerto) {
        Aeropuerto aeropuerto = buscarAeropuertoPorCodigo(codigoAeropuerto);
        if (aeropuerto != null) {
            System.out.println("Vuelos de llegada desde el aeropuerto " + codigoAeropuerto + ": " + aeropuerto.getNombre());
            for (Compania compania : companias) {
                if (compania.getDestino().equals(codigoAeropuerto)) {
                    compania.imprimirInformacionV();
                    System.out.println();
                }
            }
            System.out.println();
        }
    }




    }



