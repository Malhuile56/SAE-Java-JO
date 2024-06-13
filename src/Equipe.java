import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant, Comparable<Equipe> {
    private String nom;
    private List<Athlete> listeAthlete;
    private Pays pays;
    private Sport sport;

    public Equipe(String nom, List<Athlete> liste, Pays pays, Sport sport) {
        this.nom = nom;
        this.listeAthlete = liste;
        this.pays = pays;
        this.sport = sport;
    }

    public Equipe(String nom, Pays pays, Sport sport) {
        this.nom = nom;
        this.listeAthlete = new ArrayList<>();
        this.pays = pays;
        this.sport = sport;
    }
    
    public Pays getPays() {
        return this.pays;
    }

    public String getNom() {
        return this.nom;
    }

    public List<Athlete> getEquipe() {
        return this.listeAthlete;
    }
    
    public void ajouterAthlete(Athlete athlete) {
        if (this.pays.equals(athlete.getPays()) && !listeAthlete.contains(athlete)) {
            listeAthlete.add(athlete);
        }
    }

    public Sport getSport() {
        return this.sport;
    }

    @Override
    public void partitiper() {
        // Implémentation de la participation
    }

    public int statsEquipe() {
        int res = 0;
        for (Athlete a : listeAthlete) {
            res += a.statsAthlete();
        }
        if (listeAthlete.size() > 0) {
            res /= listeAthlete.size();
        }
        return res;
    }

    @Override
    public int compareTo(Equipe other) {
        return other.statsEquipe() - this.statsEquipe();
    }

    @Override
    public String toString() {
        return "Equipe : " + nom + " stats : " + this.statsEquipe();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((pays == null) ? 0 : pays.hashCode());
        result = prime * result + ((sport == null) ? 0 : sport.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipe other = (Equipe) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (pays == null) {
            if (other.pays != null)
                return false;
        } else if (!pays.equals(other.pays))
            return false;
        if (sport == null) {
            if (other.sport != null)
                return false;
        } else if (!sport.equals(other.sport))
            return false;
        return true;
    }


    
}
