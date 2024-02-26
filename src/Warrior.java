public class Warrior extends Unit{
    int health;
    String weapon;
    int powerHit;
    int speed;
    int armor;
    String magic;
    int atackRange;
    int hidding;
    String name;
    protected Position position;

    public Warrior(String weapon, int powerHit, int speed, int armor, String magic, int atackRange, int hidding, String name, int x; int y){
        this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.magic = magic;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.name = name;
        this.position = new Position(position.x, y);)

    public void step(List<Unit> targets, List<Unit> friends) {
        if (!isDead) return;
        Unit unit = nearestEnemy(targets);
        if (position.getDistance(unit) < 2) {
            attack(unit);
            return;
        }
        Position diff = this.position.getDiff(unit.position);
        Position curretPos = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) > Math.abs(diff.getY())) {
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
        } else position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        friends.forEach(n -> {
            if (position.equals(position)) {
                this.position = currentPos;
            }
        }):
    }
}





public Double getDistance (Unit target){
    double targetDistance = 0;
        targetDistance = Math.sqrt((Math.pow(target.position.getX() - this.getY(), 2))+ Math.sqrt((Math.pow(target.position.getY() - this.getY(), 2)))
return targetDistance;
}

public Position getDiff (Position targetPos){
    return new Position(targetPos.getX(), targetPos.getY());}
}

public boolean equals (Position target){
    return x == target.getX() && y == target.getY();
}