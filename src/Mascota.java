import java.time.LocalDate;

public class Mascota {

    // Atributos
    private String nombreMascota;
    private String especie;
    private byte edadMascota;

    // Constructor
    public Mascota (String nombreMascota, String especie, byte edadMascota) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.edadMascota = edadMascota;
    }

    // Getter
    public String getNombreMascota(){
        return nombreMascota;
    }
}
