package gestorrecreacion;

public class GestorRecreacion {

    private String mesas;                 
    private String canchas;               
    private RegistroReservas registro;    
 
    public GestorRecreacion(RegistroReservas registro) {
        this.registro = registro;
        this.mesas = crearEstados(6);     
        this.canchas = crearEstados(3);  
    }
 
    private String crearEstados(int cantidad) {
        String estados = "";
        for (int i = 0; i < cantidad; i++) {
            estados += "L";
        }
        return estados;
    }
 
    public boolean esNumero(String texto) {
        if (texto == null || texto.length() == 0 || texto.length() > 3) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    
    private boolean numeroValido(String estados, int numero) {
        return numero >= 1 && numero <= estados.length();
    }
 
    private String cambiarEstado(String estados, int numero, String nuevo) {
        int pos = numero - 1; // el índice empieza en 0
        return estados.substring(0, pos) + nuevo + estados.substring(pos + 1);
    }
 
    // ----- Mesas -----
 
    public String reservarMesa(int numero, String empleado) {
        if (!numeroValido(mesas, numero)) {
            return "La mesa " + numero + " no existe. Hay mesas de la 1 a la " + mesas.length() + ".";
        }
        if (mesas.charAt(numero - 1) == 'O') {
            return "La mesa " + numero + " ya está ocupada.";
        }
        mesas = cambiarEstado(mesas, numero, "O");
        registro.agregarReserva(new Reserva(empleado, "Mesa", numero));
        return "Mesa " + numero + " reservada para " + empleado + ".";
    }
 
    public String liberarMesa(int numero) {
        if (!numeroValido(mesas, numero)) {
            return "La mesa " + numero + " no existe. Hay mesas de la 1 a la " + mesas.length() + ".";
        }
        if (mesas.charAt(numero - 1) == 'L') {
            return "La mesa " + numero + " ya estaba libre.";
        }
        mesas = cambiarEstado(mesas, numero, "L");
        return "Mesa " + numero + " liberada.";
    }
 
    // ----- Canchas -----
 
    public String reservarCancha(int numero, String empleado) {
        if (!numeroValido(canchas, numero)) {
            return "La cancha " + numero + " no existe. Hay canchas de la 1 a la " + canchas.length() + ".";
        }
        if (canchas.charAt(numero - 1) == 'O') {
            return "La cancha " + numero + " ya está ocupada.";
        }
        canchas = cambiarEstado(canchas, numero, "O");
        registro.agregarReserva(new Reserva(empleado, "Cancha", numero));
        return "Cancha " + numero + " reservada para " + empleado + ".";
    }
 
    public String liberarCancha(int numero) {
        if (!numeroValido(canchas, numero)) {
            return "La cancha " + numero + " no existe. Hay canchas de la 1 a la " + canchas.length() + ".";
        }
        if (canchas.charAt(numero - 1) == 'L') {
            return "La cancha " + numero + " ya estaba libre.";
        }
        canchas = cambiarEstado(canchas, numero, "L");
        return "Cancha " + numero + " liberada.";
    }
 
    private String describir(String estados, String nombre) {
        String texto = "";
        for (int i = 0; i < estados.length(); i++) {
            if (i > 0) {
                texto += " | ";
            }
            texto += nombre + " " + (i + 1) + ": ";
            if (estados.charAt(i) == 'L') {
                texto += "Libre";
            } else {
                texto += "Ocupada";
            }
        }
        return texto;
    }
 
    public String mostrarMesas() {
        return describir(mesas, "Mesa");
    }
 
    public String mostrarCanchas() {
        return describir(canchas, "Cancha");
    }
 
 
    private int contarLibres(String estados) {
        int libres = 0;
        for (int i = 0; i < estados.length(); i++) {
            if (estados.charAt(i) == 'L') {
                libres++;
            }
        }
        return libres;
    }
 
    public int getTotalMesas() {
        return mesas.length();
    }
 
    public int getMesasLibres() {
        return contarLibres(mesas);
    }
 
    public int getTotalCanchas() {
        return canchas.length();
    }
 
    public int getCanchasLibres() {
        return contarLibres(canchas);
    }
 
    public RegistroReservas getRegistro() {
        return registro;
    }
}