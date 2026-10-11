public class MaquinaSoldar {

    // Atributos
    private String marca;
    private String modelo;
    private String potencia;
    private String[] metalesParaSoldar;


    // Constructor
    public MaquinaSoldar (String marca, String modelo, String potencia, String[] metalesParaSoldar){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesParaSoldar = metalesParaSoldar;
    }

    // Método soldar
    void soldar (String metal) {
        boolean puedeSoldar = false;
        for (int i = 0; i <metalesParaSoldar.length; i++){
            if (metalesParaSoldar[i].equals(metal)) {
                puedeSoldar = true;
            }
        }
        if (puedeSoldar) {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " suelda " + metal + ".");
        } else {
            System.out.println("La máquina de soldar " + marca +  " " + modelo + " no puede soldar " + metal + ".");
        }
    }


}