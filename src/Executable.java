import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Executable {
    public static <CSVReader> void main(String[] args) throws IOException {
        // Sports
        // Natation natation = new Natation();
        // // Sport escrime = new Sport("Escrime") {};
        // // Sport volleyBall = new Sport("Volley-Ball") {};
        // // Sport handball = new Sport("Handball") {};
        // // Sport athletisme = new Sport("Athlétisme") {};

        // // Pays
        // Pays france = new Pays("France");
        // Pays usa = new Pays("USA");


        // // Athletes
        // Athlete saito = new Athlete(natation, france, "Saito", "Haruto", "F", 13, 13, 7);
        // Athlete roux = new Athlete(natation, france, "Roux", "Raphaël", "F", 17, 15, 20);
        // Athlete huang = new Athlete(natation, france, "Huang", "Yan", "M", 19, 16, 11);
        // Athlete huang2 = new Athlete(natation, france, "Huang", "Yann", "M", 19, 16, 11);

        // Athlete huang3 = new Athlete(natation, usa, "Huang", "Yan", "M", 19, 16, 90);
        // Athlete huang4 = new Athlete(natation, usa, "Huang", "Yan", "M", 19, 16, 18);
        // Athlete huang5 = new Athlete(natation, usa, "Huang", "Yan", "M", 19, 16, 17);
        // Athlete huang6 = new Athlete(natation, usa, "Huang", "Yan", "M", 19, 16, 22);

        // // Natation
        // Natation n = new Natation();
        // CompetitionIndividuelle competnatationind = new CompetitionIndividuelle("Natation 100 brasse", n, "M");
        // competnatationind.ajouterAthlete(saito);
        // competnatationind.ajouterAthlete(roux);
        // competnatationind.ajouterAthlete(huang);
        // competnatationind.ajouterAthlete(huang2);
        // System.out.println(competnatationind);
        // System.out.println("Classement des Athlètes:");
        // competnatationind.start(competnatationind.getListeAthleteParticipants(), n);
        // System.out.println(competnatationind);


        // CompetitionCollective competnatationcoll = new CompetitionCollective("Natation relais libre", n, "M");
        // Equipe equipe1 = new Equipe("equipe1", france);
        // equipe1.ajouterAthlete(saito);
        // equipe1.ajouterAthlete(roux);
        // equipe1.ajouterAthlete(huang);
        // equipe1.ajouterAthlete(huang2);

        // Equipe equipe2 = new Equipe("equipe2", usa);
        // equipe2.ajouterAthlete(huang3);
        // equipe2.ajouterAthlete(huang4);
        // equipe2.ajouterAthlete(huang5);
        // equipe2.ajouterAthlete(huang6);
        // competnatationcoll.ajouterEquipe(equipe1);
        // competnatationcoll.ajouterEquipe(equipe2);

        // System.out.println(competnatationcoll);
        // System.out.println("Classement des équipes :");
        // competnatationcoll.start(competnatationcoll.getEquipesParticipantes(), n);
        // System.out.println(competnatationcoll);

        // // JO
        // JeuxOlympiques joTokyo = new JeuxOlympiques();
        // joTokyo.ajouterPays(france);
        // joTokyo.ajouterPays(usa);
        // joTokyo.ajouterEpreuve(competnatationcoll);
        // joTokyo.ajouterEpreuve(competnatationind);

        // System.out.println((joTokyo.classementPays()));



        String fileName = "donnees.csv"; // Remplacez par le chemin de votre fichier CSV
        String line = " ";


        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            List<Athlete> listeAthletes = new ArrayList<>();
            while((line = br.readLine()) != null) {
                String[] splitedString = line.split(",");
                Pays p = Pays.factory(splitedString[3]);
                Sport sp = Sport.factory(splitedString[4].split(" ")[0]);
                Athlete athlete = new Athlete(splitedString[0], splitedString[1], splitedString[2], p, sp, Integer.parseInt(splitedString[5]), Integer.parseInt(splitedString[6]), Integer.parseInt(splitedString[7]));
                listeAthletes.add(athlete);
            }
            


        } catch(FileNotFoundException e) {
            
        }



    }
}