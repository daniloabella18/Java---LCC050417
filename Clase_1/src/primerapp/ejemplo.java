
package primerapp;


public class ejemplo {
    
    public static void main(String[] args) {
        Persona p=new Persona("Claudia",17,"12345678-9");
        Persona p1=new Persona("Jorge",20,"98765432-1");
        /*
        p.setNombre("Claudia");
        p.setEdad(17);
        p.setRut("12345678-9");
        */
        Persona.setA("Hola");
        
        int p11=p1.calculo();
        int p22=p.calculo();
            System.out.println(p11+"\t"+p22);
        /*
        p1.setNombre("Jorge");
        p1.setEdad(20);
        p1.setRut("98765432-1");
        */
        System.out.println("nombre = " + p.getNombre());
        System.out.println("estatico = " + Persona.getA());
    }
}
