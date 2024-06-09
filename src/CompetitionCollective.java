import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompetitionCollective extends Epreuve {
    private List<Equipe> listeEquipesParticipantes;
    
    public CompetitionCollective(String nom, Sport sport, String sexe) {
        super(nom, sport, sexe);
        this.listeEquipesParticipantes = new ArrayList<>();
    }

    public void ajouterEquipe(Equipe equipe) {
        if (!this.listeEquipesParticipantes.contains(equipe)) {
            this.listeEquipesParticipantes.add(equipe);
        }
    }

    public void start(List<Equipe> listeEquipesParticipantes, Sport sport) {
        if(listeEquipesParticipantes.size() != sport.getNbAthletes()) {
            System.err.println("Nombre de participants invalide");
        }
        else {
            Collections.sort(listeEquipesParticipantes);
        }  
    }

    public List<Equipe> getEquipesParticipantes() {
        return this.listeEquipesParticipantes;
    }

    public String toString() {
        return this.getNom() + " : [listeEquipesParticipants=" + listeEquipesParticipantes;
    }
}