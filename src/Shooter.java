import javax.swing.text.Position;

abstract public class Shooter extends Warrior{int health, String weapon, int arrowsNumber, int powerHit, int speed, int armor, String magic, int atackRange, int hidding, String name, int x; int y){
    this.health = 60;
    this.weapon = weapon;
    this.arrowsNumber = 5;
    this.powerHit = 4;
    this.speed = 3;
    this.armor = 1;
    this.atackRange = 3;
    this.hidding = 3;
    this.name = name;
    this.position = new Position(position.x, y);





}
