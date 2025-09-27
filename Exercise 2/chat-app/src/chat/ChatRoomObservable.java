import java.util.Set;
import java.util.HashSet;

public class ChatRoomObservable implements Observable {
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) { observers.add(observer); }

    @Override
    public void unregisterObserver(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
}