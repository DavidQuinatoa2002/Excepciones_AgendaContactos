import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaContactos agenda = new AgendaContactos();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del contacto a buscar: ");
            String nombreBuscado = scanner.nextLine();
            agenda.buscarContacto(nombreBuscado);

            System.out.print("Ingrese un nuevo nombre de contacto: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el número de teléfono para " + nuevoNombre + ": ");
            String nuevoNumero = scanner.nextLine();
            agenda.agregarContacto(nuevoNombre, nuevoNumero);

            System.out.print("Ingrese el nombre del contacto a actualizar: ");
            String nombreActualizar = scanner.nextLine();
            System.out.print("Ingrese el nuevo número de teléfono para " + nombreActualizar + ": ");
            String nuevoNumeroActualizar = scanner.nextLine();
            agenda.actualizarContacto(nombreActualizar, nuevoNumeroActualizar);

        } catch (ContactoNoEncontradoException | DatosContactoInvalidosException | ContactoExistenteException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}