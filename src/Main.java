import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public class Main {
    public static void main(String[] args) {


        for (Names names: names.getName()){

        }
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }


    ArrayList<Unit> all = new ArrayList<>();
    all.addAll(team1);
    all.addAll(team2);

    all.sort(new Comparator<Unit>()){
        public int compare(Unit o1, Unit o2){
            return unit1.getPriority() - unit2.getPriority()
        }
    }
}