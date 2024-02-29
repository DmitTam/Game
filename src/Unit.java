import javax.lang.model.element.Name;
import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Random;

abstract public class Unit{
    int id;
    int health;
    int speed;
    int armor;
    int hidding;
    String name;
    String weapon;
    protected Position position;
    static int count = 0;

    public abstract Unit(int id; int health; int speed; int armor; int hidding; String name; String weapon; protected Position position;)
    {
        this.id = count++;
        this.health = 40;
        this.speed = 0;
        this.armor = 0;
        this.hidding = 0;
        this.name = new Names();
        this weapon = new Weapons();
        this.position = new Position(x, y);

        public static int getSpeed(Unit){
        return speed;
    }

        public boolean needHeal(Unit){
            if (this.health < 20) return true;
    }

        for (Names names: names.getName()){

        }

        private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

        public String toInfo() {
        return String.format("Type = %s; ID = %d; Name = %s; %s; Health = %d; Protection = %d",
                this.getClass().getSimpleName(),id, name, position.toString(),health, protection);
    }


        public boolean heroIsAlive(Unit unit) {
        if (unit.getHealth() > 0) {
            return true;
        } else System.out.printf("Покойся с миром, ",unit.getName());
        return false;
    }

        public void askForHeal (){
//            запрос на лечение, если здоровье юнита достигнет 30%

    }
        public int findNearestFriend(ArrayList<Unit>myTeam){
        int minDistanse = Integer.MAX_VALUE;
        int id = -1;
        for (Unit unit : myTeam) {
            if (Position.getDiff(Unit.this.getPosition().getX(), Unit.this.getPosition().getY(),
                    unit.getPosition().getX(),unit.getPosition().getY()) < minDistanse){
                minDistanse = Position.findDistance(Unit.this.getPosition().getX(), Unit.this.getPosition().getY(),
                        unit.getPosition().getX(),unit.getPosition().getY());
                id = unit.getId();
            }
        }
        return id;
    }

        public int findNearestEnemy(ArrayList<Unit> targetTeam){
        int minDistanse = Integer.MAX_VALUE;
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