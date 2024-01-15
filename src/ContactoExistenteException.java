public class ContactoExistenteException extends Exception {
    private final String nombreContacto;

    public ContactoExistenteException(String nombreContacto) {
        super();
        this.nombreContacto = nombreContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }
}