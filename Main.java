package company.com;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException  {
        Masina m = new Masina("BMW","Alb");
        Student s = new Student("Pop","Ioan",m);

        Student deep = (Student) s.cloneDeep();
        Student shallow = (Student) s.cloneShallow();

        s.getMasina().vopsire("Negru");

        System.out.println(deep);
        System.out.println(shallow);

        Masina m2 = new Masina("Tesla","Verde");
        Student s2 = new Student("Gavrilovici","Tiberiu",m2);

        Student deep2 = (Student) s2.cloneDeep();
        Student shallow2 = (Student) s2.cloneShallow();

        s2.getMasina().vopsire("Portocaliu");

        System.out.println(deep2);
        System.out.println(shallow2);
    }
}
