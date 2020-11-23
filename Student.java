package company.com;
public class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    @Override
    public String toString() {
        return "Studentul cu numele: " + nume + " "+ prenume+ " are masina " + masina;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public Object cloneShallow() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object cloneDeep() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.masina= (Masina) cloned.masina.clone();
        return cloned;
    }


}
