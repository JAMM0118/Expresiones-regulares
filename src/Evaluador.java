/*
Autores:

Jhon Alejandro Martínez - 2259565
Juan Miguel Posso - 2259610
Nicolás Mauricio Rojas - 2259460
Víctor Manuel Hernandez - 2259520

Fecha: 05 -Julio- 2023
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluador {

    /**
     * Esta función toma una cadena de texto como entrada y devuelve otra cadena de texto.
     * Dentro de la función, se crea una cadena de texto vacía llamada 'result'.
     * Luego, se define un patrón de expresión regular para buscar cadenas que comiencen con letras mayúsculas y terminen con un signo de exclamación.
     * Se utiliza este patrón para crear un objeto Matcher y buscar coincidencias en la cadena de texto de entrada.
     * En un bucle, se encuentran todas las coincidencias y se agregan a la cadena 'result'.
     * Finalmente, se devuelve la cadena 'result'.
     * @return result String 
 */
    public String admiracion(String texto) {
        String result = "";
        Pattern admiracion = Pattern.compile("([A-Z]*([a-zA-Z_0-9]*)*[!])");
        Matcher matcher = admiracion.matcher(texto);
        while (matcher.find()) {
            String exclamacion = matcher.group();
            result += exclamacion;
        }
        return result;
    }

    /**
     * Esta función define un método llamado 'abreviaciones' que toma un parámetro de tipo String llamado 'texto'.
     * Utiliza expresiones regulares para buscar abreviaciones en el texto de entrada y las devuelve como una cadena de texto concatenada.
     * Dentro del método, se crea una cadena de texto vacía llamada 'result'.
     * Luego, se utiliza un patrón de expresión regular para buscar las abreviaciones en el texto de entrada.
     * Se utiliza este patrón para encontrar todas las coincidencias en el texto y se agregan a la cadena 'result' utilizando concatenación.
     * Finalmente, se devuelve la cadena 'result' que contiene todas las abreviaciones encontradas en el texto de entrada.
     * @return result String 
    */
    public String abreviaciones(String texto){
        String result = "";
        Pattern abreviaciones = Pattern.compile("([A-Z]*([a-zA-Z_0-9]*))*[']([A-Z]*([a-zA-Z_0-9]*)*)");
        Matcher matcher = abreviaciones.matcher(texto);
            while (matcher.find()) {
                String abreviacion = matcher.group();
                result += abreviacion;
            }
        return result;
    }
    /**
     * Esta función toma una cadena de texto como entrada y busca palabras separadas por guiones dentro de la cadena.
     * Utiliza expresiones regulares para definir el patrón de una palabra separada por guiones y luego utiliza un objeto Matcher para encontrar todas las ocurrencias de este patrón dentro de la cadena de entrada.
     * Concatena todas las palabras separadas por guiones encontradas y devuelve el resultado como una cadena de texto.
     * @return result String
    */
    public String compuestas(String texto){
        String result = "";
        Pattern compuesta = Pattern.compile("[a-zA-Z]*-[a-zA-Z]*");
        Matcher matcher = compuesta.matcher(texto);
        while (matcher.find()) {
            String compuestas = matcher.group();
            result += compuestas;
        }
        return result;
    }

    /**
     * Esta función define un método llamado 'preguntas' que toma un parámetro de tipo String llamado 'texto' y devuelve una cadena de texto.
     * Utiliza expresiones regulares para buscar y extraer todas las preguntas en el texto de entrada.
     * Luego, concatena todas las preguntas encontradas en una sola cadena de texto antes de devolverla.
     * @return result String
    */
    public String preguntas(String texto){
        String result="";
        Pattern pregunta = Pattern.compile("[A-Z]([a-zA-Z_0-9]*[ \\t\\n\\x0B\\f\\r]*)*[?]");
        Matcher matcher = pregunta.matcher(texto);
        while (matcher.find()) {
            String preguntas = matcher.group();
            result += preguntas;
        }
        return result;
    }
}

