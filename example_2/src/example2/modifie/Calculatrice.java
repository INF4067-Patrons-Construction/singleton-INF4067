package example2.modifie;

public final class Calculatrice {

    // Instance unique de la calculatrice
    private static Calculatrice instance = null;

    // Attributs de la calculatrice
    private int x;
    private int y;

    // Constructeur privé sans paramètre
    private Calculatrice() {
        this.x = 0;
        this.y = 0;
    }

    // Constructeur privé avec paramètres
    private Calculatrice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Retourne l'instance unique sans paramètres
    public static Calculatrice getInstance() {
        if (instance == null) {
            instance = new Calculatrice();
        }
        return instance;
    }

    // Retourne l'instance unique avec paramètres
    public static Calculatrice getInstance(int x, int y) {
        if (instance == null) {
            instance = new Calculatrice(x, y);
        }
        return instance;
    }

    // Modifie les deux valeurs de la calculatrice
    public void definirValeurs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Addition
    public int somme() {
        return x + y;
    }

    // Moyenne
    public float moyenne() {
        return (x + y) / 2.0f;
    }

    // Affichage
    public void afficher() {
        System.out.println("Valeur de x : " + x);
        System.out.println("Valeur de y : " + y);
        System.out.println("Somme : " + somme());
        System.out.println("Moyenne : " + moyenne());
    }

    // Empêche le clonage
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

