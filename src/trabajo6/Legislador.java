package trabajo6;

/**
 *
 * @author pedri
 */
public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;
   
    private String camaraEnQueTrabaja;
   
    public Legislador(){
        super();
    }
    public Legislador(String nombre, String apellido, int edad, String DNI) {
        super(nombre, apellido, edad, DNI);
    }

    public String getCamaraEnQueTrabaja() {
        return camaraEnQueTrabaja;
    }
    public void setCamaraEnQueTrabaja(String camaraEnQueTrabaja) {
        this.camaraEnQueTrabaja = camaraEnQueTrabaja;
    }  
    public String getProvinciaQueRepresenta(){
        return provinciaQueRepresenta;
    }
   
    public abstract void muestraCamaraEnLaQueTrabaja();
}