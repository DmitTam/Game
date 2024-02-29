import java.util.ArrayList;
import java.util.List;

public class Position {
    int x;
    int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }


    public Integer getDistance (Unit target){
        int targetDistance = 0;
        targetDistance = Math.sqrt((Math.pow(target.position.getX() - this.getY(), 2))+ Math.sqrt((Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistance;
    }

    public Position getDiff (Position targetPos){
        return new Position(targetPos.getX(), targetPos.getY());}
}

    public boolean equals (Position target){ return x == target.getX() && y == target.getY();
    }
}
