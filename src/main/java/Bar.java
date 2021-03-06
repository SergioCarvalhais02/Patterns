import java.util.ArrayList;
import java.util.List;

abstract class Bar {
    List<BarObserver> observers;
    public Bar(){observers = new ArrayList();}
    public abstract boolean isHappyHour();
    public abstract void startHappyHour();
    public abstract void endHappyHour();
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
}
