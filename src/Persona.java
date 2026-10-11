import java.time.LocalDate;

public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    // Constructor
    public Persona (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Método sacar pasaporte
    void sacarPasaporte (String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento){
        this.pasaporte = new Pasaporte(numero, nacionalidad, fechaEmision, fechaVencimiento); // construye un objeto Pasaporte nuevo, usando los 4 parámetros que sacarPasaporte() recibió. Además dispara constructor de pasaporte.
        // this.pasaporte es el pasaporte recién creado
    }

    // Método tomar vuelo
    void tomarVuelo (String pais){
        if (pasaporte != null && pasaporte.isEstaVigente()){
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + "." );
        } else {
            System.out.println(nombre + " " + apellidos + " no podrá tomar el vuelo ya que su pasaporte no está vigente." );
        }
    }

    // Método jugar
    void jugar (){
        if (mascota != null ){
            System.out.println(nombre + " " + apellidos + " juega con " + mascota.getNombreMascota() + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene una mascota con la cual jugar.");
        }
    }

    // Getter
    public void adoptarMascota(Mascota nuevaMascota){
        this.mascota = nuevaMascota;
    }


}

