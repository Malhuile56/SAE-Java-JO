import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Executable {
    public static void main(String[] args) {
        // Sports
        Sport natation = new Sport("Natation") {};
        Sport escrime = new Sport("Escrime") {};
        Sport volleyBall = new Sport("Volley-Ball") {};
        Sport handball = new Sport("Handball") {};
        Sport athletisme = new Sport("Athlétisme") {};

        // Pays
        Map<String, Pays> dicoPays = new HashMap<>();
        dicoPays.put("Maroc", new Pays("Maroc"));
        dicoPays.put("USA", new Pays("USA"));
        dicoPays.put("France", new Pays("France"));
        dicoPays.put("Allemagne", new Pays("Allemagne"));
        dicoPays.put("Kenya", new Pays("Kenya"));

        // Athletes
        Athlete saito = new Athlete(natation, dicoPays.get("Maroc"), "Saito", "Haruto", "F", 13, 13, 7);
        Athlete roux = new Athlete(natation, dicoPays.get("USA"), "Roux", "Raphaël", "F", 17, 15, 20);
        Athlete huang = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 11);
        Athlete huang2 = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yann", "M", 19, 16, 11);

        Athlete huang3 = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 1);
        Athlete huang4 = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 51);
        Athlete huang5 = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 25252);
        Athlete huang6 = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 10);


        Athlete schneider = new Athlete(escrime, dicoPays.get("France"), "Schneider", "Lena", "M", 11, 14, 5);
        Athlete hasegawa = new Athlete(volleyBall, dicoPays.get("Allemagne"), "Hasegawa", "Takumi", "M", 10, 13, 12);
        Athlete suzuki = new Athlete(handball, dicoPays.get("Kenya"), "Suzuki", "Rin", "M", 15, 6, 18);
        Athlete faure = new Athlete(athletisme, dicoPays.get("Allemagne"), "Faure", "Léa", "M", 20, 2, 17);
        
        // Natation
        // List<Athlete> listnatation = new ArrayList<>();
        // listnatation.add(saito);
        // listnatation.add(roux);
        // listnatation.add(huang);
        // listnatation.add(huang2);
        // Natation n = new Natation(listnatation);
        // System.out.println(n);
        // System.out.println("Classement des Athlètes:");
        // Collections.sort(listnatation);
        // System.out.println(listnatation);

        // CompetitionIndividuelle natation100brasse = new CompetitionIndividuelle("Natation 100m brasse", new Natation(listnatation), "M");
        // System.out.println(natation100brasse);

        // Natation
        Natation n = new Natation();
        CompetitionIndividuelle competnatationind = new CompetitionIndividuelle("Natation 100 brasse", n, "M");
        competnatationind.ajouterAthlete(saito);
        competnatationind.ajouterAthlete(roux);
        competnatationind.ajouterAthlete(huang);
        competnatationind.ajouterAthlete(huang2);
        System.out.println(competnatationind);
        System.out.println("Classement des Athlètes:");
        competnatationind.start(competnatationind.getListeAthleteParticipants(), n);
        System.out.println(competnatationind);


        CompetitionCollective competnatationcoll = new CompetitionCollective("Natation relais libre", n, "M");
        Equipe equipe1 = new Equipe("equipe1");
        equipe1.ajouterAthlete(saito);
        equipe1.ajouterAthlete(roux);
        equipe1.ajouterAthlete(huang);
        equipe1.ajouterAthlete(huang2);

        Equipe equipe2 = new Equipe("equipe2");
        equipe2.ajouterAthlete(huang3);
        equipe2.ajouterAthlete(huang4);
        equipe2.ajouterAthlete(huang5);
        equipe2.ajouterAthlete(huang6);
        competnatationcoll.ajouterEquipe(equipe1);
        competnatationcoll.ajouterEquipe(equipe2);

        System.out.println(competnatationcoll);
        System.out.println("Classement des équipes :");
        competnatationcoll.start(competnatationcoll.getEquipesParticipantes(), n);
        System.out.println(competnatationcoll);

    }
}