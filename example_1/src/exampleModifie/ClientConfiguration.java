package exampleModifie;

public class ClientConfiguration {

    public static void main(String[] args) {

        Configuration config1 = Configuration.getInstance();

        config1.modifierConfiguration("AZ PULSE", "1.0");

        System.out.println(config1.afficherConfiguration());

        Configuration config2 = Configuration.getInstance();

        System.out.println(config1 == config2);
    }
}