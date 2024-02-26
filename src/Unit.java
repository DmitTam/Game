import javax.swing.text.Position;
import java.util.ArrayList;

abstract public class Unit{
    int health;
    int speed;
    int armor;
    int hidding;
    String name;
    protected Position position;

    public abstract Unit implements Step(int health, String weapon, int powerHit, int speed, int armor, String magic, int atackRange, int hidding, String name, int x; int y){
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

    public int findNearestEnemy(ArrayList<Unit> targetTeam){
        double minDistanse = Double.MAX_VALUE;
        int id = -1;
        for (Unit unit : targetTeam) {
            if (Position.getDiff(Unit.this.getPosition().getX(), Unit.this.getPosition().getY(),
                    unit.getPosition().getX(),unit.getPosition().getY()) < minDistanse){
                minDistanse = Position.findDistance(Unit.this.getPosition().getX(), Unit.this.getPosition().getY(),
                        unit.getPosition().getX(),unit.getPosition().getY());
                id = unit.getId();
            }
        }
        return id;
    }

    public void getDamage(Unit unit1, Unit unit2){
    снятие защиты? снятие здоровья
                проверка
    }



    public void step();
    }
}