public class Clicker extends Zombie{

    private String capacidadAuditiva;

    public Clicker(String nombre, String skin, String nivdelDeVida, String arma, String capacidadAuditiva) {
        super(nombre, skin, nivdelDeVida, arma);
        this.capacidadAuditiva = capacidadAuditiva;
    }

    public Clicker() {
    }

    public String getCapacidadAuditiva() {
        return capacidadAuditiva;
    }

    public void setCapacidadAuditiva(String capacidadAuditiva) {
        this.capacidadAuditiva = capacidadAuditiva;
    }

    public void listen(){
        System.out.println("Escuche a un humano");
    }

    @Override
    public String toString() {
        return "Clicker{" +
                "capacidadAuditiva='" + capacidadAuditiva + '\'' +
                "} " + super.toString();
    }
}
