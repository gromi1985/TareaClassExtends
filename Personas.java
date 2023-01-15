/*
* Si no quiero que nadie me copie mis datos o que nadie herede de mi es decir que nadie pueda
acceder a mis variables y mis metodos entonces a la clase le antepongo la palabra clave final

 * En el momento que declaro una clase como abstracta ya no puedo instanciarla
 * */
package Tarea03;
 public class Personas {
    private int edad;
    private String nombre;
    private String telefono;


   public Personas() {
       System.out.println("Estoy en el contructor de Persona");
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getTelefono() {
        return this.telefono;
    }

}
