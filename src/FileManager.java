/*
Autores:

Jhon Alejandro Martínez - 2259565
Juan Miguel Posso - 2259610
Nicolás Mauricio Rojas - 2259460
Víctor Manuel Hernandez - 2259520

Fecha: 05 -Julio- 2023
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFileChooser;

public class FileManager {
    Evaluador evaluador = new Evaluador();

    public String path = "";

    /**
     * Permite al usuario elegir un archivo mediante un cuadro de diálogo de selección de archivo.
     * Si se selecciona un archivo válido, se almacena la ruta absoluta del archivo seleccionado en 
     * la variable 'path'.
     */
    public void chooseFile(){
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            File file = fileChooser.getSelectedFile();

            // Realizar operaciones con el archivo seleccionado
            System.out.println("Archivo seleccionado: " + file.getAbsolutePath());
            path = file.getAbsolutePath();
        }
    }

    /**
     * Lee el contenido de un archivo y lo devuelve como una cadena de texto.
     * Utiliza la ruta almacenada en la variable 'path' para acceder al archivo.
     * Si se produce un error al leer el archivo, se imprime el mensaje de error correspondiente.
     * Devuelve el contenido del archivo como una cadena de texto.
     */
 
    public String readFile(int opcion){
        String resultadoFinal = "";
        try {
            RandomAccessFile archivo  = new RandomAccessFile(path,"r" );
            String linea = "";

            while ((linea = archivo.readLine()) != null) {
                if(opcion == 1){
                    if (!(evaluador.compuestas(linea).equals(""))) {
                        resultadoFinal +=  evaluador.compuestas(linea)  ;
                    }
                }
                if(opcion == 2){
                    if (!(evaluador.preguntas(linea).equals(""))) {
                        resultadoFinal +=  evaluador.preguntas(linea) ;
                    }
                }
                if(opcion == 3){
                    if (!(evaluador.admiracion(linea).equals(""))) {
                        resultadoFinal +=  evaluador.admiracion(linea) ;
                    }
                }
                if(opcion == 4){
                    if (!(evaluador.abreviaciones(linea).equals(""))) {
                        resultadoFinal +=  evaluador.abreviaciones(linea);
                    }
                }
                
            }
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return resultadoFinal;
    }
}