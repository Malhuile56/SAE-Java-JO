import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant {
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
    
    @Override
    public void partitiper() {

    }

}
