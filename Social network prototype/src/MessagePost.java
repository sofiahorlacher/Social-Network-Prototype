import java.util.ArrayList;

public class MessagePost {
	private String username;
	private String message;
	private Long timestamp;
	private Integer likes;
	private ArrayList<String> comments;
	
	public MessagePost(){
		comments = new ArrayList<String>();
		message = "";
		username = "";
		timestamp = System.currentTimeMillis();
		likes = 0;
	}
		
	public String toString() {
	return "message: " + this.message + "¦ comment: " + this.comments + "¦ likes: " + this.likes + "¦ Time: " + Timestamp.timeString(timestamp);	
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public void addcommenttomessage(String comment) {
		comments.add(comment);
	}
	
	public Integer addlikestomessage() {
		likes++;
		return likes;
	}
	
	public Integer removelikefrommessage() {
		likes--;
		return likes;
	}
	
	
	}
