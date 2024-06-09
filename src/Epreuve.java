public abstract class Epreuve {
    private String nom;
    private Sport sport;
    private String sexe;

    public Epreuve(String nom, Sport sport, String sexe) {
        this.nom = nom;
        this.sport = sport;
        this.sexe = sexe;
    }

    public String getNom() {
        return this.nom;
    }

    public Sport getSport() {
        return this.sport;
    }

    public String getSexe() {
        return this.sexe;
    }

    
}
