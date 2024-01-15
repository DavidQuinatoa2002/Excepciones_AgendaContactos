public class ContactoNoEncontradoException extends Exception {
    private final String nombreContacto;

    public ContactoNoEncontradoException(String nombreContacto) {
        super();
        this.nombreContacto = nombreContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }
}