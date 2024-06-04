import java.util.ArrayList;
import java.util.List;

public class CompetitionIndividuelle extends Epreuve {
    private List<Athlete> listeAthleteParticipants;

    public CompetitionIndividuelle(String nom, Sport sport, String sexe) {
        super(nom, sport, sexe);
        this.listeAthleteParticipants = new ArrayList<>();
    }

    public void ajouterAthlete(Athlete athlete) {
        listeAthleteParticipants.add(athlete);
    }
}
