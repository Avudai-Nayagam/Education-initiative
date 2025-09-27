# Real-time Chat Application (Java)

## Overview
A simple real-time chat app using Java, demonstrating Observer, Singleton, and Adapter design patterns.  
Users join/create chat rooms, send/receive messages, see active users, and view message history.

## Design Patterns Used
- **Observer:** Users notified of new messages/user activities.
- **Singleton:** ChatRoom manager and Logger.
- **Adapter:** Supports different protocols (WebSocket, HTTP).

## Key Classes
- `ChatRoom`, `ChatRoomObservable`, `ChatUser`, `ProtocolAdapter`, `Logger`

## How to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/<your-username>/<repo>.git
    cd <repo>
    ```
2. Compile:
    ```bash
    javac src/**/*.java
    ```
3. Run:
    ```bash
    java -cp src Main
    ```

## Test
Test files are in `src/test/`. Example:
```bash
javac src/test/TestChatRoom.java
java -cp src/test TestChatRoom
```

## Code Walkthrough
- **Observer:** Notifies all users on message/user events.
- **Singleton:** One ChatRoom per room ID.
- **Adapter:** Choose protocol adapter for communication.

## Author
[Your Name](https://github.com/<your-username>)