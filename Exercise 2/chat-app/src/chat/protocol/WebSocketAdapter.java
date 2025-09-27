public class WebSocketAdapter implements ProtocolAdapter {
    @Override
    public void send(String message) {
        System.out.println("[WebSocket] Sending: " + message);
    }

    @Override
    public String receive() {
        // Simulate receiving
        return "[WebSocket] Message received";
    }
}