import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();

        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== GESTOR DE NOTAS ===");
            System.out.println("1. Crear nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Listar importantes");
            System.out.println("0. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String titulo;
                    do {
                        System.out.println("Introduce el título");
                        titulo = scanner.nextLine();
                        if (titulo.isEmpty()) {
                            System.out.println("El título no puede estar vacío");
                        }
                    } while (titulo.isEmpty());

                    String contenido;
                    do {
                        System.out.println("Introduce una descripción del contenido: ");
                        contenido = scanner.nextLine();
                        if (contenido.isEmpty()) {
                            System.out.println("El contenido no puede estar vacío");
                        }
                    } while (contenido.isEmpty());

                    boolean importante = false;
                    while (true){
                        System.out.println("¿Es importante?: ");
                        String respuesta = scanner.nextLine();

                        if (respuesta.equalsIgnoreCase("s")) {
                            importante = true;
                            break;
                        } else if (respuesta.equalsIgnoreCase("n")) {
                            importante = false;
                            break;
                        } else {
                            System.out.println("Respuesta inválida. Usa 's' o 'n'");
                        }
                    }

                    gestor.crearNota(titulo,contenido,importante);
                    System.out.println("Nota creada correctamente.");

                    break;
                case "2":

                    System.out.println("Mostrando todas las notas: ");
                    gestor.listarNotas();
                    break;
                case "3":
                    // TODO: implementar
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}