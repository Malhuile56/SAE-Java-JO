public abstract class Sport {
    private String nom;
    private int nbAthletes; 

    public Sport(String nom) {
        this.nom = nom;

        switch (nom) {
            case "natation":
            case "athletisme":
                this.nbAthletes = 4;
                break;
            case "volleyball":
                this.nbAthletes = 6;
                break;
            case "handball":
                this.nbAthletes = 7;
                break;
            default:
                System.err.println("erreur lors de la saisie du sport");
                break;
}
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbAthletes() {
        return this.nbAthletes;
    }
    
}