
package example2.modifie;

public class TestCalculatrice {

    public static void main(String[] args) {

        // Première récupération de l'instance
        Calculatrice calc1 = Calculatrice.getInstance();

        // Définition des valeurs
        calc1.definirValeurs(10, 20);

        // Affichage des résultats
        System.out.println("=== Première calculatrice ===");
        calc1.afficher();

        // Deuxième récupération de l'instance
        Calculatrice calc2 = Calculatrice.getInstance(50, 100);

        System.out.println("\n=== Deuxième calculatrice ===");
        calc2.afficher();

        // Vérification de l'unicité
        System.out.println("\nLes deux références désignent-elles "
                + "la même instance ? " + (calc1 == calc2));

        // Modification des valeurs à travers la deuxième référence
        calc2.definirValeurs(40, 60);

        System.out.println("\n=== Après modification ===");
        calc1.afficher();
    }
}
