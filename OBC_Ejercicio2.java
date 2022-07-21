
public class OBC_Ejercicio2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.setPuertas();

        System.out.println(miCoche.puertas);
    }

    static class Coche {
        public int puertas = 0;

        public void setPuertas() {
            this.puertas ++;
        }
    }
}
