import java.time.LocalDate;

public class Pasaporte {

    // Atributos
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    // Métodos
    // Constructor
    public Pasaporte (String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento){
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = fechaVencimiento.isAfter(LocalDate.now()); // esto para que se haga TRUE si la fecha de vencimiento es mayor que HOY.
    }

    // Getters
    public String getNumero(){
        return numero;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public LocalDate getFechaEmision(){
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = fechaVencimiento.isAfter(LocalDate.now()); // Si alguien cambia la fecha de vencimiento, estaVigente se actualiza junto con ella. Evita datos inconsistentes.
    }

    // equals()
    public boolean equals(Pasaporte pasaporte) {
        return this.numero.equals(pasaporte.numero);
    }

    // toString()
    @Override
    public String toString(){
        return "Número: " + numero + " Nacionalidad: " + nacionalidad + " Fecha de emisión: " + fechaEmision.toString() + " Fecha vencimineto: " + fechaVencimiento.toString() + ".";
    }

    public boolean isEstaVigente(){ // se usa is en lugar de get porque es un boolean
        return estaVigente;
    }
    // Profe: Public boolean estaVigente() { return LocalDate.now().isBefore(fechaVencimiento); }

}
