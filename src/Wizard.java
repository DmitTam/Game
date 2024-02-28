import javax.swing.text.Position;
import java.util.Random;

public class Wizard extends Magician{

    public Wizard(String name, int x, int y){
        this.weapon = "Посох";
        this.powerHit = 10;
        this.speed = 2;
        this.armor = 2;
        this.magic = 20;
        this.atackRange = 2;
        this.hidding = 2;
        this.heeling = 5;
        this.name = name;
        this.position = new Position(position.x, y);}

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
