import java.time.LocalDate;

public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte; // Asociación permanente - tenemos los objetos de la relación como atributos de la clase
    private Mascota mascota; // Asociación

    // Métodos
    // Constructor
    public Persona (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        pasaporte = null; // Se inicializan en null
        mascota = null; // Se inicializan en null
    }

    // Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public Pasaporte getPasaporte(){
        return pasaporte;
    }

    public Mascota getMascota(){
        return mascota;
    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // equals()
    public boolean equals(Persona persona){
        return this.nombre.equals(persona.nombre) && this.apellidos.equals(persona.apellidos);
    }

    // toString()
    @Override
    public String toString(){
        return "Nombre completo: " + nombre + " " + apellidos + ".";
    }

    // Relaciones
    // Método sacar pasaporte (relacion de Asociación pero por COMPOSICION - el pasaporte se hace a la medida y tiene que estar dentro de la persona)
    public void sacarPasaporte (String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento){
        this.pasaporte = new Pasaporte(numero, nacionalidad, fechaEmision, fechaVencimiento); // construye un objeto Pasaporte nuevo, usando los 4 parámetros que sacarPasaporte() recibió. Además dispara constructor de pasaporte.
        // this.pasaporte es el pasaporte recién creado
    }

    // Método tomar vuelo
    public void tomarVuelo (String pais){
        if (pasaporte != null && pasaporte.isEstaVigente()){
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + "." );
        } else {
            System.out.println(nombre + " " + apellidos + " no podrá tomar el vuelo ya que su pasaporte no está vigente." );
        }
    }

    // Método adoptar Mascota (relacion de Asociación pero por AGREGACION - ya la mascota existía antes de adoptarla)
    public void adoptarMascota(Mascota nuevaMascota){
        this.mascota = nuevaMascota;
    }

    // Método jugar
    public void jugar (){
        if (mascota != null ){
            System.out.println(nombre + " " + apellidos + " juega con " + mascota.getNombreMascota() + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene una mascota con la cual jugar.");
        }
    }

    // Método soldar (relación de dependencia, necesita la maquina y el material)
    public void soldar (MaquinaSoldar maquinaSoldar, String metal) { // la persona recibe la máquina, la herramienta y recibe el metal
        if (maquinaSoldar != null){
            System.out.println(nombre + " " + apellidos + " hace una soldadura.");
            maquinaSoldar.soldar(metal);
        } else {
            System.out.println("No se puede soldar sin máquina.");
        }
    }


}




