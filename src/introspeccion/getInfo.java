package introspeccion;

/**
 *
 * @author guillermogallegogonzalez
 */
public class getInfo {

    public void getInformacion(String clase) throws ClassNotFoundException, NoSuchFieldException {

        Class formatoClase = Class.forName(clase);

        System.out.println("Resultado getName() de la clase " + clase + " " + formatoClase.getName());
        System.out.println("Resultado getModifiers() de la clase " + clase + " " + formatoClase.getModifiers());
        System.out.println("Resultado getMethods() de la clase " + clase + " " + formatoClase.getMethods());

    }

}
