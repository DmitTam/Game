import java.util.Comparator;

public class SpeedComparator implements Comparator {
    public int compare(Unit unit1, Unit unit2){
        return Integer.compare(unit1.speed, unit2.speed);
    }
}
