package trabajo6;

/**
 *
 * @author pedri
 */
public abstract class Senador extends Legislador {

    public Senador(String nombre, String apellido, int edad, String DNI) {
        super(nombre, apellido, edad, DNI);
        setCamaraEnQueTrabaja("Senador");
    }
    public void muestraCamaraEnLaQueTrabaja(){
        System.out.println("La camara en que trabaja es: "+getCamaraEnQueTrabaja());
    }
}