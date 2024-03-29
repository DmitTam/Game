import java.util.Random;

public class Robber extends Warrior {
    int insolence,
    public Robber(String name, int x, int y) {
        super(name, x, y);
        this.weapon = "Кинжал";
        this.powerHit = 10;
        this.insolence = 12;
        this.speed = 2;
        this.armor = 3;
        this.atackRange = 1;
        this.hidding = 1;
        this.name = name;
        this.position = new Position(position.x, y);
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}