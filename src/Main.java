import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public class Main{
    public static ArrayList<Unit> myTeam = new ArrayList<>();
    public static ArrayList<Unit> targetTeam = new ArrayList<>();
    public static ArrayList<Unit> all = new ArrayList<>();
    all.addAll(myTeam);
    all.addAll(targetTeam);
    all.sort(new Comparator<Unit>()){
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        createTeam();

        public static void createTeam(){
            Random random = new Random();
            int teamcount = 10;
            for (int i = 1; i < teamcount+1; i++) {
                int val = random.nextInt(7);
                int coordX1 = random.nextInt(10);
                int coordX2 = random.nextInt(10);
                Position xy1 = new Position(coordX1, 1);
                Position xy2 = new Position(coordX2, 10);
                System.out.println(xy1);
                switch (val) {
                    case 0:
                        myTeam.add(new Sniper(getName(), i,1));
                        break;
                    case 1:
                        myTeam.add(new Wizard(getName(), i,1));

                        break;
                    case 2:
                        myTeam.add(new Monk(getName(),i,1));

                        break;
                    case 3:
                        myTeam.add(new Robber(getName(), i,1));

                        break;
                    case 4:
                        myTeam.add(new Peasant(getName(), i,1));

                        break;
                    case 5:
                        myTeam.add(new Achery(getName(), i,1));

                        break;

                }
            }
    }








}