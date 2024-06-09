public abstract class Sport {
    private String nom;
    private int nbAthletes; 

    public Sport(String nom) {
        this.nom = nom;
        if (nom == "natation") {
            this.nbAthletes = 4;
        }
        if (nom == "athletisme") {
            this.nbAthletes = 4;
        }
        if (nom == "volleyball") {
            this.nbAthletes = 6;
        }
        if (nom == "handball") {
            this.nbAthletes = 7;
        }
        else {
            System.err.println("erreur lors de la saisie du sport");
        }
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbAthletes() {
        return this.nbAthletes;
    }
    
}