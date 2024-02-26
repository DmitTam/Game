import javax.swing.text.Position;

public abstract class Magician extends Warrior{String magic;

    public abstract Magician(int health, String weapon, int powerHit, int speed, int armor, String magic, int atackRange, int hidding, String name, int x; int y){
        this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.magic = magic;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.name = name;
        this.position = new Position(position.x, y);
}
