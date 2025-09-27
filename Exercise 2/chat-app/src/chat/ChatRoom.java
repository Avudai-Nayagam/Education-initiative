import java.util.*;
import chat.*;

public class ChatRoom {
    private static final Map<String, ChatRoom> rooms = new HashMap<>();
    private final String roomId;
    private final ChatRoomObservable observable = new ChatRoomObservable();
    private final List<Message> messages = new ArrayList<>();
    private final Set<ChatUser> activeUsers = new HashSet<>();

    private ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    public static synchronized ChatRoom getInstance(String roomId) {
        return rooms.computeIfAbsent(roomId, ChatRoom::new);
    }

    public void join(ChatUser user) {
        activeUsers.add(user);
        observable.registerObserver(user);
        observable.notifyObservers(user.getUsername() + " joined the room.");
    }

    public void leave(ChatUser user) {
        activeUsers.remove(user);
        observable.unregisterObserver(user);
        observable.notifyObservers(user.getUsername() + " left the room.");
    }

    public void sendMessage(ChatUser sender, String msg) {
        Message m = new Message(sender.getUsername(), msg);
        messages.add(m);
        observable.notifyObservers(sender.getUsername() + ": " + msg);
    }

    public List<Message> getMessageHistory() { return Collections.unmodifiableList(messages); }
    public Set<ChatUser> getActiveUsers() { return Collections.unmodifiableSet(activeUsers); }
    public String getRoomId() { return roomId; }
}