/*
Autores:

Jhon Alejandro Martínez - 2259565
Juan Miguel Posso - 2259610
Nicolás Mauricio Rojas - 2259460
Víctor Manuel Hernandez - 2259520

Fecha: 05 -Julio- 2023
*/

import javax.swing.JOptionPane;

public class App {

    /**
     * Muestra un menú interactivo para que el usuario realice diferentes acciones
     * relacionadas con la gestión de archivos.
     * El usuario puede seleccionar un archivo de texto y luego elegir entre varias
     * opciones para mostrar diferentes contenidos del archivo.
     * El método utiliza JOptionPane para mostrar mensajes y obtener la entrada del
     * usuario.
     * Si el usuario selecciona la opción 1, se llama al método chooseFile() de la
     * clase FileManager para seleccionar un archivo de texto.
     * Luego, se muestra un mensaje de éxito utilizando JOptionPane.
     * Después de seleccionar el archivo, se muestra un nuevo menú con opciones
     * adicionales.
     * Dependiendo de la opción seleccionada, se realiza una acción específica
     * llamando al método readFile() de la instancia de FileManager.
     * El método readFile() se llama con diferentes parámetros según la opción
     * seleccionada.
     * Si el usuario selecciona la opción 5, el programa se cierra.
     * Si el usuario selecciona cualquier otra opción, el programa también se
     * cierra.
     */
    public static void menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("\tMenu principal\n" +
                "1. Seleccionar un archivo de texto\n" + "2. Salir\n" + "Seleccione una opcion: "));

        if (opcion == 1) {
            FileManager fm = new FileManager();
            fm.chooseFile();
            JOptionPane.showMessageDialog(null, "Archivo de texto seleccionado con exito");
            int opciones = 0;
            
            do{
                opciones = Integer.parseInt(JOptionPane.showInputDialog("\t¿Que quieres hacer?\n" +
                    "1. Mostrar palabras compuestas\n" + "2. Mostrar preguntas\n" + "3. Mostrar exclamaciones\n" +
                    "4. Mostrar abreviaciones\n" + "5. Salir\n" + "Seleccione una opcion: "));

                switch (opciones) {
                case 1:
                    System.out.println("\nPalabras Compuestas");
                    System.out.print(fm.readFile(1));
                    break;
                case 2:
                    System.out.println("\nPreguntas");
                    System.out.print(fm.readFile(2));
                    break;
                case 3:
                    System.out.println("\nExclamaciones");
                    System.out.println(fm.readFile(3));
                    break;
                case 4:
                    System.out.println("\nAbreviaciones");
                    System.out.println(fm.readFile(4));
                    break;
                case 5:
                    return;
                }
            }while(opciones != 5);
        } else {
            System.exit(0);
        }
    }

    /**
     * Funcion main, se crea un ciclo infinito que esta llamando constantemente
     * a el metodo del menu de opciones
     **/
    public static void main(String[] args) throws Exception {
        while (true) {
            menu();
        }
    }

}