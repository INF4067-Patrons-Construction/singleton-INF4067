package singleton;

public final class Singleton {

    private static Singleton instance = null;

    // Autres attributs, classiques et non static
    private String attribut1;
    private int attribut2;

    // Constructeur de l'objet
    private Singleton() {
        super();
    }

    // Méthode renvoyant une instance de la classe Singleton
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    // D'autres méthodes classiques et non static
    public void op1(int x, int y, int z) {
        this.attribut1 = "bonjour";
    }

    public void op2(int x, int y, int z) {
    }
}
