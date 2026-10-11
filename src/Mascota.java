import java.time.LocalDate;

public class Mascota {

    // Atributos
    private String nombreMascota;
    private String especie;
    private byte edadMascota;

    // Métodos
    // Constructor
    public Mascota (String nombreMascota, String especie, byte edadMascota) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.edadMascota = edadMascota;
    }

    // Getters
    public String getNombreMascota(){
        return nombreMascota;
    }

    public String getEspecie(){
        return especie;
    }

    public byte getEdadMascota() {
        return edadMascota;
    }

    // Setters
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdadMascota(byte edadMascota) {
        this.edadMascota = edadMascota;
    }

    // equals()
    public boolean equals(Mascota mascota){
        return this.nombreMascota.equals(mascota.nombreMascota) && this.especie.equals(mascota.especie) && this.edadMascota == mascota.edadMascota;
    }

    // toString()
    @Override
    public String toString(){
        return "Nombre: " + nombreMascota + "\nEspecie: " + especie + "\nEdad: " + edadMascota + "\n.";
    }
}
