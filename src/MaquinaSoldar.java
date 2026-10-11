import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaquinaSoldar {

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    // Atributos
    private String marca;
    private String modelo;
    private String potencia;
    private String[] metales;

    // Métodos
    // Constructor
    public MaquinaSoldar(String marca, String modelo, String potencia, int cantidadMetales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        metales = new String[cantidadMetales];
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public String[] getMetales() {
        return metales;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    // equals()
    public boolean equals(MaquinaSoldar maquinaSoldar) {
        return this.marca.equals(maquinaSoldar.marca) && this.modelo.equals(maquinaSoldar.modelo);
    }

    // toString()
    @Override
    public String toString() {
        return "Marca: " + marca + "Modelo: " + modelo + "Potencia: " + potencia + "Metales: " + metales.toString();
    }

    // Método definitMetales
    public void definirMetales() throws IOException {
        for (int i = 0; i< metales.length; i++){
            System.out.printf("Ingrese el metal " + (i + 1) + ": ");
            metales[i] = entrada.readLine();
        }
    }
    // Método soldar
    public void soldar(String metal) {
        for (int i = 0; i < metales.length; i++) {
            if (metales[i].equals(metal)) { // revisa si el metal es igual al que le pasamos en línea 60.
                System.out.println("La máquina de soldar " + marca + " " + modelo + " suelda el " + metal + ".");
                return;
            }
        }
        System.out.println("La máquina de soldar " + marca + " " + modelo + " no suelda " + metal + ".");
    }
}