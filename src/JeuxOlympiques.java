import java.util.ArrayList;
import java.util.List;

public class JeuxOlympiques {
    private List<Pays> listePaysParticipants;
    private List<Epreuve> listeEpreuves;

    public JeuxOlympiques() {
        this.listePaysParticipants = new ArrayList<>();
        this.listeEpreuves = new ArrayList<>();
    }

    public void ajouterPays(Pays pays) {
        if (!listePaysParticipants.contains(pays)) {
            listePaysParticipants.add(pays);
        }
    }

    public void ajouterEpreuve(Epreuve epreuve) {
        if (!listeEpreuves.contains(epreuve)) {
            listeEpreuves.add(epreuve);
        }
    }

    
}
