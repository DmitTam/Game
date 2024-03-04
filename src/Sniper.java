

public class Sniper extends Shooter {
    ;
    int bullets;

    public Sniper(String name, int x, int y) {
        this.weapon = "Винтовка";
        this.powerHit = 4;
        this.speed = 3;
        this.armor = 1;
        this.atackRange = 2;
        this.hidding = 10;
        this.bullets = 10;
        this.name = name;
        this.position = new Position(position.x, y);
    }
}
