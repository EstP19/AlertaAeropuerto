public class Main {
    public static void main(String[] args) {
        // Crear una instancia de agregarInformacion para manejar aeropuertos y vuelos
        agregarInformacion agregarInformacion = new agregarInformacion();

        // Crear instancias de Aeropuerto
        Aeropuerto aeropuerto1 = new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1);
        Aeropuerto aeropuerto2 = new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1);
        Aeropuerto aeropuerto3 = new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", 1);
        Aeropuerto aeropuerto4 = new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", 0);
        Aeropuerto aeropuerto5 = new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", -3);

        // Agregar aeropuertos a la lista
        agregarInformacion.agregarAeropuertos(aeropuerto1);
        agregarInformacion.agregarAeropuertos(aeropuerto2);
        agregarInformacion.agregarAeropuertos(aeropuerto3);
        agregarInformacion.agregarAeropuertos(aeropuerto4);
        agregarInformacion.agregarAeropuertos(aeropuerto5);

        // Imprimir información de los aeropuertos
        System.out.println("Informacion de Aeropuertos");
        agregarInformacion.imprimirInformacionAeropuertos();

        // Crear instancias de Compania (vuelos)
        Compania vuelo1 = new Compania("R", "BCN01", "MAD01", "1:00", "150", "Airbus");
        Compania vuelo2 = new Compania("R", "MAD01", "BCN01", "01:00", "150", "Airbus");
        Compania vuelo3 = new Compania("R", "BCN01", "LON01", "01:05", "180", "Boeing");
        Compania vuelo4 = new Compania("R", "LON01", "BCN01", "01:05", "180", "Boeing");
        Compania vuelo5 = new Compania("R", "BCN01", "LON01", "01:10", "120", "Airbus");
        Compania vuelo6 = new Compania("R", "LON01", "BCN01", "01:10", "120", "Airbus");
        Compania vuelo7 = new Compania("R", "LON01", "SPA01", "07:00", "200", "Boeing");
        Compania vuelo8 = new Compania("R", "SPA01", "MAD01", "07:00", "200", "Boeing");
        Compania vuelo9 = new Compania("C", "BCN01", "MAD01", "01:00", "150", "Airbus");
        Compania vuelo10 = new Compania("C", "BCN01", "MAD01", "01:00", "150", "Airbus");
        Compania vuelo11 = new Compania("C", "MAD01", "BCN01", "01:00", "150", "Airbus");
        Compania vuelo12 = new Compania("C", "BCN01", "LON01", "01:00", "180", "Boeing");
        Compania vuelo13 = new Compania("C", "LON01", "BCN01", "01:00", "180", "Boeing");
        Compania vuelo14 = new Compania("C", "LON01", "BCN01", "01:00", "180", "Boeing");
        Compania vuelo15 = new Compania("C", "BCN01", "LON01", "01:00", "120", "Airbus");
        Compania vuelo16 = new Compania("C", "SPA01", "SPA01", "01:00", "120", "Airbus");
        Compania vuelo17 = new Compania("C", "SIB01", "SPA01", "01:00", "120", "Airbus");

        // Agregar vuelos a la lista
        agregarInformacion.agregarVuelo(vuelo1);
        agregarInformacion.agregarVuelo(vuelo2);
        agregarInformacion.agregarVuelo(vuelo3);
        agregarInformacion.agregarVuelo(vuelo4);
        agregarInformacion.agregarVuelo(vuelo5);
        agregarInformacion.agregarVuelo(vuelo6);
        agregarInformacion.agregarVuelo(vuelo7);
        agregarInformacion.agregarVuelo(vuelo8);
        agregarInformacion.agregarVuelo(vuelo9);
        agregarInformacion.agregarVuelo(vuelo10);
        agregarInformacion.agregarVuelo(vuelo11);
        agregarInformacion.agregarVuelo(vuelo12);
        agregarInformacion.agregarVuelo(vuelo13);
        agregarInformacion.agregarVuelo(vuelo14);
        agregarInformacion.agregarVuelo(vuelo15);
        agregarInformacion.agregarVuelo(vuelo16);
        agregarInformacion.agregarVuelo(vuelo17);

        // Imprimir información de los vuelos
        System.out.println("Informacion Vuelos");
        agregarInformacion.imprimirInformacionVuelos();

        // Mostrar vuelos de salida desde cada aeropuerto
        System.out.println("Vuelos de salida desde los aeropuertos");
        for (Aeropuerto aeropuerto : agregarInformacion.getAeropuertos()) {
            agregarInformacion.mostrarVuelosSalidaPorAeropuerto(aeropuerto.getCodigo());
        }

        // Mostrar vuelos de llegada a cada aeropuerto
        System.out.println("Vuelos de llegada a los aeropuertos");
        for (Aeropuerto aeropuerto : agregarInformacion.getAeropuertos()) {
            agregarInformacion.mostrarVuelosllegadaPorAeropuerto(aeropuerto.getCodigo());
        }
    }
}
