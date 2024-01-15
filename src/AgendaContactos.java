import java.util.HashMap;
import java.util.Map;

public class AgendaContactos {
    private Map<String, String> agenda;

    public AgendaContactos() {
        this.agenda = new HashMap<>();
        // Agregamos algunos contactos de ejemplo
        agenda.put("Juan", "123-456-7890");
        agenda.put("María", "987-654-3210");
    }

    public void buscarContacto(String nombre) throws ContactoNoEncontradoException {
        if (!agenda.containsKey(nombre)) {
            throw new ContactoNoEncontradoException(nombre);
        }

        String numero = agenda.get(nombre);
        System.out.println("Número de teléfono para '" + nombre + "': " + numero);
    }

    public void agregarContacto(String nombre, String numero)
            throws DatosContactoInvalidosException, ContactoExistenteException {
        if (nombre.trim().isEmpty() || numero.trim().isEmpty()) {
            throw new DatosContactoInvalidosException("Nombre y número de teléfono no pueden estar vacíos.");
        }

        if (agenda.containsKey(nombre)) {
            throw new ContactoExistenteException(nombre);
        }

        agenda.put(nombre, numero);
        System.out.println("Contacto '" + nombre + "' agregado correctamente a la agenda.");
    }

    public void actualizarContacto(String nombre, String nuevoNumero)
            throws ContactoNoEncontradoException, DatosContactoInvalidosException {
        if (!agenda.containsKey(nombre)) {
            throw new ContactoNoEncontradoException(nombre);
        }

        if (nuevoNumero.trim().isEmpty()) {
            throw new DatosContactoInvalidosException("El nuevo número de teléfono no puede estar vacío.");
        }

        agenda.put(nombre, nuevoNumero);
        System.out.println("Contacto '" + nombre + "' actualizado correctamente en la agenda.");
    }
}