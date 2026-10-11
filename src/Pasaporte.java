import java.time.LocalDate;

public class Pasaporte {

    // Atributos
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    // Constructor
    public Pasaporte (String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento){
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = fechaVencimiento.isAfter(LocalDate.now()); // esto para que se haga TRUE si la fecha de vencimiento es mayor que HOY.
    }

    // Getter
    public boolean isEstaVigente(){ // se usa is en lugar de get porque es un boolean
        return estaVigente;
    }

}
