public class Athlete implements Participant {
    private Sport sport;
    private Pays pays;
    private String nom;
    private String prenom;
    private String sexe;
    private int endurance;
    private int agilite;
    private int force;

    public Athlete(Sport sport, Pays pays, String nom, String prenom, String sexe, int endurance, int agilite, int force) {
        this.sport = sport;
        this.pays = pays;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.endurance = endurance;
        this.agilite = agilite;
        this.force = force;
    }

    public Sport getSport() {
        return this.sport;
    }

    public Pays getPays() {
        return this.pays;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getSexe() {
        return this.sexe;
    }

    public int getEndurance() {
        return this.endurance;
    }

    public int getAgilite() {
        return this.agilite;
    }

    public int getForce() {
        return this.force;
    }

    @Override
    public void partitiper() {
        // finir
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || !(o instanceof Athlete)) {return false;}
        Athlete athlete = (Athlete) o;
        if (!this.nom.equals(athlete.getNom())) {return false;}
        if (!this.prenom.equals(athlete.getPrenom())) {return false;}
        if (!this.sexe.equals(athlete.getSexe())) {return false;}
        return this.pays.equals(athlete.getPays());
    }

    @Override
    public int hashCode() {
        int res = this.nom.hashCode();
        res += 59 * this.prenom.hashCode();
        res += 59 * this.sexe.hashCode();
        res += 59 * this.pays.hashCode();
        return res;
    }
}
