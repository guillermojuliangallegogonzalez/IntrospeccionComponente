package introspeccion;

import java.util.Scanner;

/**
 *
 * @author guillermogallegogonzalez
 */
public class Introspeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        //Instancia clase getInfo
        getInfo informante = new getInfo();

        //Objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //Variables
        String clase;

        System.out.println("Intorduzca el nombre de la clase de la que desee obtener la información: ");
        clase = entrada.nextLine();
        informante.getInformacion(clase);
        //Manejo Excepciones
        try {
            informante.getInformacion(clase);
        } catch (Exception error) {
            error.printStackTrace();
        }

    }

}
