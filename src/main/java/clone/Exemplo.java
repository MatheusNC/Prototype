package clone;

public class Exemplo {
    public static void main(String[] args) {
        Forma forma = new Forma(3,5);

        Forma forma2 = forma.clone();

        System.out.println(forma2.toString());
    }
}
