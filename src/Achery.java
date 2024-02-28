import javax.swing.text.Position;
import java.util.Random;

public class Achery extends Shooter{int arrows;

    public Achery(String name, int x, int y) {
        super();
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

        public boolean needArrows(){
            if this.arrows < 2 { return true;
        }
        }

