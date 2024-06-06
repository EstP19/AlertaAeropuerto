import java.util.ArrayList;
import java.util.List;

public class agregarInformacion {
    // Lista para almacenar los aeropuertos
    private final List<Aeropuerto> aeropuertos = new ArrayList<>();
    // Lista para almacenar las compañías (vuelos)
    private final List<Compania> companias = new ArrayList<>();

    // Constructor por defecto
    public agregarInformacion() {}

    // Método para obtener la lista de aeropuertos
    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    // Método para obtener la lista de compañías
    public List<Compania> getCompanias() {
        return companias;
    }

    // Método para agregar un aeropuerto a la lista
    public void agregarAeropuertos(Aeropuerto aeropuerto) {
        aeropuertos.add(aeropuerto);
    }

    // Método para imprimir la información de todos los aeropuertos
    public void imprimirInformacionAeropuertos() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            aeropuerto.imprimirInformacion();
            System.out.println();
        }
    }

    // Método para agregar un vuelo (compañía) a la lista
    public void agregarVuelo(Compania compania) {
        companias.add(compania);
    }

    // Método para imprimir la información de todos los vuelos
    public void imprimirInformacionVuelos() {
        for (Compania compania : companias) {
            compania.imprimirInformacionV();
            System.out.println();
        }
    }

    // Método privado para buscar un aeropuerto por su código
    private Aeropuerto buscarAeropuertoPorCodigo(String codigo) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCodigo().equals(codigo)) {
                return aeropuerto;
            }
        }
        return null;
    }

    // Método para mostrar los vuelos de salida desde un aeropuerto específico
    public void mostrarVuelosSalidaPorAeropuerto(String codigoAeropuerto) {
        Aeropuerto aeropuerto = buscarAeropuertoPorCodigo(codigoAeropuerto);
        if (aeropuerto != null) {
            System.out.println("Vuelos de salida desde el aeropuerto " + codigoAeropuerto + ": " + aeropuerto.getNombre());
            for (Compania compania : companias) {
                if (compania.getCodigo().equals(codigoAeropuerto)) {
                    compania.imprimirInformacionV();
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    // Método para mostrar los vuelos de llegada a un aeropuerto específico
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
