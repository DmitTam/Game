import javax.swing.text.Position;

public class Peasant extends Unit{int health, String weapon, int powerHit, int speed, int armor, int atackRange, int hidding, String name, int x; int y){
    this.health = health;
    this.weapon = weapon;
    this.powerHit = powerHit;
    this.speed = speed;
    this.armor = armor;
    this.atackRange = atackRange;
    this.hidding = hidding;
    this.name = name;
    this.position = new Position(position.x, y);

}
}