import java.util.Random;

public class Peasant extends Unit{String name;


    public Peasant(String name, int x, int y){
        this.health = 40;
        this.weapon = "Лопата";
        this.name = new Names();
        this.speed = 0;
        this.armor = 40;
        this.hidding = 0;
        this.name = name;
        this.position = new Position(position.x, y);
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

}