package exampleModifie;

public class Configuration {
    private static Configuration instance = null;
    private String nomApplication;
    private String version;

    private Configuration(){

    }
    public static Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return instance;
    }
    public void modifierConfiguration(String nom, String version){
        this.nomApplication = nom;
        this.version = version;
    }
    public String afficherConfiguration(){
        return "Application : " + nomApplication + "\nVersion : " + version;
    }
}
