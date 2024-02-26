import java.util.ArrayList;
import java.util.List;

public class Position {
    int x;
    int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

        public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }


    public Double getDistance (Unit target){
        double targetDistance = 0;
        targetDistance = Math.sqrt((Math.pow(target.position.getX() - this.getY(), 2))+ Math.sqrt((Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistance;
    }

    public Position getDiff (Position targetPos){
        return new Position(targetPos.getX(), targetPos.getY());}
}

    public boolean equals (Position target){
        return x == target.getX() && y == target.getY();
}
}