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
        if(listeEquipesParticipantes.size() <= 1) {
            System.err.println("Nombre de participants invalide");
        }
        else {
            Collections.sort(listeEquipesParticipantes);
            for (int i = 0 ; i < listeEquipesParticipantes.size() ; i++) {
                if (i == 0) {
                    listeEquipesParticipantes.get(i).getPays().ajouterOr();
                }
                if (i == 1) {
                    listeEquipesParticipantes.get(i).getPays().ajouterArgent();
                }
                if (i == 2) {
                    listeEquipesParticipantes.get(i).getPays().ajouterBronze();
                }
                
            }
        }  
    }

    public List<Equipe> getEquipesParticipantes() {
        return this.listeEquipesParticipantes;
    }

    public String toString() {
        return this.getNom() + " : [listeEquipesParticipants = " + listeEquipesParticipantes + "]";
    }
}