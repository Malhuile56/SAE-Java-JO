import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Executable {
    public static void main(String[] args) {
        


        Sport natation = new Sport("Natation") {};
        Sport escrime = new Sport("Escrime") {};
        Sport volleyBall = new Sport("Volley-Ball") {};
        Sport handball = new Sport("Handball") {};
        Sport athletisme = new Sport("Athlétisme") {};

        
        Map<String, Pays> dicoPays = new HashMap<>();
        dicoPays.put("Maroc", new Pays("Maroc"));
        dicoPays.put("USA", new Pays("USA"));
        dicoPays.put("France", new Pays("France"));
        dicoPays.put("Allemagne", new Pays("Allemagne"));
        dicoPays.put("Kenya", new Pays("Kenya"));


        Athlete saito = new Athlete(natation, dicoPays.get("Maroc"), "Saito", "Haruto", "F", 13, 13, 7);
        Athlete roux = new Athlete(natation, dicoPays.get("USA"), "Roux", "Raphaël", "F", 17, 15, 20);
        Athlete schneider = new Athlete(escrime, dicoPays.get("France"), "Schneider", "Lena", "M", 11, 14, 5);
        Athlete hasegawa = new Athlete(volleyBall, dicoPays.get("Allemagne"), "Hasegawa", "Takumi", "M", 10, 13, 12);
        Athlete suzuki = new Athlete(handball, dicoPays.get("Kenya"), "Suzuki", "Rin", "M", 15, 6, 18);
        Athlete faure = new Athlete(athletisme, dicoPays.get("Allemagne"), "Faure", "Léa", "M", 20, 2, 17);
        Athlete huang = new Athlete(natation, dicoPays.get("USA"), "Huang", "Yan", "M", 19, 16, 11);


        List<Athlete> list1 = new ArrayList<>();

        list1.add(saito);
        list1.add(roux);
        list1.add(schneider);
        list1.add(hasegawa);
        list1.add(suzuki);
        list1.add(faure);
        list1.add(huang);
    
        System.out.println(list1);

    }
}
