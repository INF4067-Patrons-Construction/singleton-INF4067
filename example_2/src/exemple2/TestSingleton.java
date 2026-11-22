
package exemple2;

public class TestSingleton {

    public static void main(String[] args) {

        int som = Singleton.getInstance().Somme(2, 5);
        System.out.println("La somme est : " + som);

        // Une instance est déjà en cours
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();
        System.out.println(s1 == s2);
    }
}
