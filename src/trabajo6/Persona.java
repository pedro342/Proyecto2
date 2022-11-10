package trabajo6;

/**
 *
 * @author pedri
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    public Persona(){
        nombre=""; apellido=""; edad=0;
    }
    public Persona(String nombre, String apellido, int edad, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String toString(){
        Integer datoEdad=edad;
        return "-Nombre: ".concat(nombre).concat(" -Apellidos: ").concat(apellido).concat(" -Edad:").concat(datoEdad.toString() );
    }
}