/*
Autores: Jhon Alejandro Martinez - 2259565
Juan Miguel Posso Alvarado - 2259610
Victor Manuel Hernandez-  2259000
Nicolas Mauricio Rojas - 2259000

Date: 05 -Julio- 2023
*/

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            menu();
        } 
    }

    public static void menu(){

        int opcion=  Integer.parseInt(JOptionPane.showInputDialog("\tMenu principal\n"+
        "1. Seleccionar un archivo de texto\n" + "2. Salir\n" +"Seleccione una opcion: "));
        
        if(opcion == 1){
            FileManager fm = new FileManager();
            fm.chooseFile();
            
            JOptionPane.showMessageDialog(null,"Texto seleccionado con exito");
            
            int opciones=  Integer.parseInt(JOptionPane.showInputDialog("\t¿Que quieres hacer?\n"+
            "1. Mostrar palabras compuestas\n" + "2. Mostrar preguntas\n" + "3. Mostrar exclamaciones\n" +
            "4. Mostrar abreviaciones\n" +"5. Salir\n" +"Seleccione una opcion: "));

            switch(opciones){
                case 1: System.out.print(fm.readFile(1)); break;
                case 2: System.out.print(fm.readFile(2));break;
                case 3: System.out.println(fm.readFile(3));break;
                case 4: System.out.println(fm.readFile(4));break;
                case 5: System.exit(0);break;
            }
        
        }else{
            System.exit(0);
        }
    }
}