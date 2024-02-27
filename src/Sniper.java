public class Sniper extends Shooter{
    int bullets;

    public Archery(String name, int x, int y) {
        this.weapon = "Лук";
        this.powerHit = 4;
        this.speed = 3;
        this.armor = 1;
        this.atackRange = 2;
        this.hidding = 10;
        this.name = name;
        this.position = new Position(position.x, y);
}
