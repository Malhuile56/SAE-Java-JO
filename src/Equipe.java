import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant, Comparable<Equipe> {
    private String nom;
    private List<Athlete> listeAthlete;
    private Pays pays;

    public Equipe(String nom, List<Athlete> liste, Pays pays) {
        this.nom = nom;
        this.listeAthlete = liste;
        this.pays = pays;
    }

    public Equipe(String nom, Pays pays) {
        this.nom = nom;
        this.listeAthlete = new ArrayList<>();
        this.pays = pays;
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
}
