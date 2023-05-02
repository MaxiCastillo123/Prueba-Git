public class Plataforma extends Objeto{
    private String material;
    private String soporte;

    public Plataforma(double ancho, double alto, String material, String soporte) {
        super(ancho, alto);
        this.material = material;
        this.soporte = soporte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "material='" + material + '\'' +
                ", soporte='" + soporte + '\'' +
                "} " + super.toString();
    }
}
