import java.util.ArrayList;

public class PhotoPost {
	private String username;
	private String filename;
	private String caption;
	private Long timestamp;
	private Integer likes;
	private String pfad;
	private ArrayList<String> comments;
	
	public PhotoPost() {
		comments = new ArrayList<String>();
		timestamp = System.currentTimeMillis();
		likes = 0;
	}
	
	public String toString() {
		return "photo: " + this.pfad + "¦ "+ "caption: " + this.caption + "¦ comment: " + this.comments + "¦ likes: " + this.likes + "¦ Time: " + Timestamp.timeString(timestamp);	
		}  
	
	public String getPfad() {
		return pfad;
	}

	public void setPfad(String pfad) {
		this.pfad = pfad;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public void addcommenttophoto(String comment) {
		comments.add(comment);
	}
	
	public Integer addlikestophoto() {
		likes++;
		return likes;
	}
	
	public Integer removelikefromphoto() {
		likes--;
		return likes;
	}
	
	
	

	

}
