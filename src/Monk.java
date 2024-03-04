import java.util.Random;

public class Monk extends Magician{

    public Monk(String name, int x, int y){
        this.weapon = "Распятье";
        this.powerHit = 5;
        this.speed = 2;
        this.armor = 2;
        this.magic = 5;
        this.atackRange = 2;
        this.hidding = 2;
        this.heeling = 20;
        this.name = name;
        this.position = new Position(position.x, y);
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
