import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main (String[] args) throws IOException {

        //1. Contrucción de 2 personas

        Persona persona1 = new Persona("Esteban", "Quitós Matarrita");
        Persona persona2 = new Persona("Graciela", "Mendez Cubillo");

        //2. Contrucción de 1 Mascota

        Mascota mascota1 = new Mascota("Consuelo","Perro",(byte) 7);

        //3. Contrucción de 1 Máquina de Soldar

        MaquinaSoldar maquinaSoldar1 = new MaquinaSoldar("ESAB","Renegade VOLT ES 200i","200 A", 2);
        maquinaSoldar1.definirMetales();

        // Sacar pasaporte
        persona1.sacarPasaporte("114221645","Costarricense", LocalDate.of(2020,8,20), LocalDate.of(2025,8,20));
        persona2.sacarPasaporte("114322571","Costarricense", LocalDate.of(2025,12,30), LocalDate.of(2030,12,30));

        // Tomar vuelo
        persona1.tomarVuelo("Argentina");
        persona2.tomarVuelo("Cuba");

        // Adoptar Mascota
        persona1.adoptarMascota(mascota1);
        persona2.adoptarMascota(mascota1);

        // Jugar
        persona1.jugar();
        persona2.jugar();

        // Soldar
        persona1.soldar(maquinaSoldar1, "Hierro");
        persona2.soldar(maquinaSoldar1, "Aluminio");
    }
}


