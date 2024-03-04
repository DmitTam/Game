

public abstract class Warrior extends Unit{
    int health;
    String weapon;
    int powerHit;
    int speed;
    int armor;
    int atackRange;
    int hidding;
    String name;
    protected Position position;

    public abstract Warrior(String weapon, int powerHit, int speed, int armor, int atackRange, int hidding, String name, int x; int y){
        this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.name = name;
        this.position = new Position(position.x, y);)

    public void step(List<Unit> targetTeam, List<Unit> myTeam) {
        if (heroIsAlive = true){
        Unit unit = findNearestEnemy(targetTeam);
        if (position.getDistance(unit) < 2) {
            getDamage(unit);
            return;}
        }
        Position diff = this.position.getDiff(unit.position);
        Position curretPos = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) > Math.abs(diff.getY())) {
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
        } else position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        myTeam.forEach(n -> {
            if (position.equals(position)) {
                this.position = currentPos;
            }
        }
;    }
}
