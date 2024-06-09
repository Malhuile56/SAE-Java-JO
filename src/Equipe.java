import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant, Comparable<Equipe> {
    private String nom;
    private List<Athlete> listeAthlete;

    public Equipe(String nom, List<Athlete> liste) {
        this.nom = nom;
        this.listeAthlete = liste;
    }

    public Equipe(String nom) {
        this.nom = nom;
        this.listeAthlete = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public List<Athlete> getEquipe() {
        return this.listeAthlete;
    }
    
    public void ajouterAthlete(Athlete athlete) {
        this.listeAthlete.add(athlete);
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
