package company.com;
public class Masina implements Cloneable {
    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void vopsire(String culoare){
        this.culoare=culoare;
    }

    @Override
    public String toString() {
        return "Masina este de marca " +  marca +  " si are culoarea " + culoare;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
