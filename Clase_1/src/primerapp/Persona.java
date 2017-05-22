
package primerapp;

public class Persona {
    //constructor
    Persona(String nombre, int edad, String rut){
        this.nombre=nombre;
        this.edad=edad;
        this.rut=rut;
    }
 
    public static String getA() {
        return a;
    }

    public static void setA(String aA) {
        a = aA;
    }
    //atributos
    private String nombre;
    private static String a;
    private int edad;
    private String rut;
    //metodos encapsular clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    public int calculo(){
        return this.edad*100;
    }
}
