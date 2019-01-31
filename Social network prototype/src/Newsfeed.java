import java.util.ArrayList;
import java.util.Scanner;


public class Newsfeed {
    private ArrayList<MessagePost> messagepost;
    private ArrayList<PhotoPost> photopost;
      
	public Newsfeed() {
		messagepost = new ArrayList<MessagePost>();	
		photopost = new ArrayList<PhotoPost>();
		
	}
	
	public void addmessage(String eingabemessage) {
		MessagePost messagepost1 = new MessagePost();
		messagepost1.setMessage(eingabemessage); 
		messagepost.add(messagepost1); 
		System.out.println("Your message has successfully been posted.");
		System.out.println("Total messages" + messagepost.size());

	}
	
	public void addphoto(String photopfad, String caption) {
		PhotoPost photopost1 = new PhotoPost();
		photopost1.setPfad(photopfad);
		photopost1.setCaption(caption);
		photopost.add(photopost1);
		System.out.println("Your photo has successfully been posted.");
		System.out.println("Total photos" + photopost.size());
	}
	
	public void addlikemessage(int index) {
		messagepost.get(index).addlikestomessage();
	}
	
	public void removelikemessage(int index) {
		messagepost.get(index).removelikefrommessage();
	}
	
	public void addlikephoto(int index) {
		photopost.get(index).addlikestophoto();
	}
	
	public void removelikephoto(int index) {
		photopost.get(index).removelikefromphoto();
	}
	
	public void showpost() {
		System.out.println("Total messages: " + messagepost.size());
		for (MessagePost anzeige : messagepost) {
			System.out.println(anzeige);
		}
		System.out.println("");
		System.out.println("Total photos: " + photopost.size());
		for (PhotoPost ausgabe : photopost) {
			System.out.println(ausgabe);
		}	
		
	}
	
	public void showallmessages() {
		System.out.println("Total: " + messagepost.size());
		for (MessagePost anzeige : messagepost) {
			System.out.println(anzeige);	
		}
	}
	
	public void showallphotos() {
		System.out.println("Total: " + photopost.size());
		for (PhotoPost ausgabe : photopost) {
			System.out.println(ausgabe);
		}
	}
	
	public void addcommenttomessage(String comment, int index) {
		messagepost.get(index).addcommenttomessage(comment);
	}
	
	public void addcommenttophoto(String comment, int index) {
		photopost.get(index).addcommenttophoto(comment);
	}
	
	public int findrightmessage(int whichmessage) {
		messagepost.indexOf(whichmessage);
		return whichmessage;
	}
	
	public int findrightphoto(int whichphoto) {
		photopost.indexOf(whichphoto);
		return whichphoto;
	}
	
}
