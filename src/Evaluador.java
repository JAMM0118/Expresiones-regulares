import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluador {

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

