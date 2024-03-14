package lt.techin.cinema.exceptions.handler;

public class MessageDetails {
    private String message;

    public MessageDetails(String message) {this.message = message;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
