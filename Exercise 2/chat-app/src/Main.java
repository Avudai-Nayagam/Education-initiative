import chat.*;
import chat.protocol.*;
import common.Logger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter chat room ID: ");
        String roomId = sc.nextLine().trim();
        ChatRoom room = ChatRoom.getInstance(roomId);

        System.out.print("Enter your username: ");
        String username = sc.nextLine().trim();
        ChatUser user = new ChatUser(username);

        room.join(user);
        logger.log(username + " joined " + roomId);

        boolean running = true;
        while (running) {
            System.out.println("1. Send message");
            System.out.println("2. Show active users");
            System.out.println("3. Show history");
            System.out.println("4. Leave room");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("Message: ");
                    String msg = sc.nextLine();
                    room.sendMessage(user, msg);
                    break;
                case 2:
                    System.out.println("Active users:");
                    for (ChatUser u : room.getActiveUsers())
                        System.out.println("- " + u.getUsername());
                    break;
                case 3:
                    System.out.println("History:");
                    for (Message m : room.getMessageHistory())
                        System.out.println(m.getSender() + ": " + m.getText());
                    break;
                case 4:
                    room.leave(user);
                    logger.log(username + " left " + roomId);
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}