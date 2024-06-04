import java.util.ArrayList;
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
}
