import java.util.Random;

public class Achery extends Shooter{int arrows;

    public Achery(String name, int x, int y) {
        this.weapon = "Лук";
        this.powerHit = 4;
        this.speed = 3;
        this.armor = 1;
        this.atackRange = 2;
        this.hidding = 3;
        this.arrows = 8;
        this.name = name;
        this.position = new Position(position.x, y);


        private static String getName(){
            return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        }

        public String getInfo(){
            return "Лучник";
        };


        public boolean needArrows(){
            if this.arrows < 2 { return true;
        }

        @Override
        public void step(ArrayList<Unit> targetTeam, ArrayList<Unit> myTeam) {
             if ((health<=0) || (arrows == 0)) return;
             Unit target = super.findNearestEnemy(targetTeam);
             target.getDamage(this.powerHit);
             arrows--;
        }

