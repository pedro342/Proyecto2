package trabajo6;

/**
 *
 * @author pedri
 */
public abstract class Diputado extends Legislador{

    public Diputado(String nombre, String apellido, int edad, String DNI) {
        super(nombre, apellido, edad, DNI);
        setCamaraEnQueTrabaja("Diputado");
    }
    public void muestraCamaraEnLaQueTrabaja(){
       System.out.println("La camara en la que trabaja es: "+getCamaraEnQueTrabaja());
    }
}