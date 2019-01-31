
public class Eingabekonsole {
	String wasgemachtwird;
	String eingabe;
	String eingabemessage;
	String message1;
	MyScanner scanner1;
	Newsfeed news1;
	
	
	public Eingabekonsole() {
	news1 = new Newsfeed();
	wasgemachtwird = "";
	scanner1 = new MyScanner();
	}
	
	public void starter() {
		
	System.out.println("What is your username");
	String username = scanner1.nextinput();
	System.out.println("Welcome back, " + username);
	
	User user1 = new User();
	user1.setUsername(username);
	
	this.wasmachen();
	}
	
	public void wasmachen() {
	
	do {
		System.out.println("What do you want to do? You can post a message or photo.\n"
				+ "Or you can look at the latest news.\n"
				+ "You can even like or comment existing posts.\n"
				+ "Or you can remove likes.");
		
	wasgemachtwird = scanner1.nextinput();	    	
    if (wasgemachtwird.toLowerCase().contains("message".toLowerCase())){
    	System.out.println("Write your message that you want to post:");
		message1 = scanner1.nextinput();
		
		news1.addmessage(message1);
		
    	} else if(wasgemachtwird.toLowerCase().contains("photo".toLowerCase())){
    		System.out.println("Which picture do you want to post?");
    		message1 = scanner1.nextinput();
			System.out.println("What caption do you want to post?");
			String caption = scanner1.nextinput();
			news1.addphoto(message1, caption);
			
    		
    	} else if(wasgemachtwird.toLowerCase().contains("news".toLowerCase())) {
    		news1.showpost();
    		
    	} else if(wasgemachtwird.toLowerCase().contains("comment".toLowerCase())) {
    		System.out.println("Do you want to comment a photo or message?");
    		message1 = scanner1.nextinput();
    		
    		if (message1.toLowerCase().contains("message".toLowerCase())) {
    			System.out.println("To which message do you want to add a comment?");	    			
    			news1.showallmessages();
    			message1 = scanner1.nextinput();
    			int number = Integer.parseInt(message1); 
    			int index = news1.findrightmessage(number);
    			index --;
    			
    			System.out.println("Please write your comment that you want to post:");
    			message1 = scanner1.nextinput();	
    			news1.addcommenttomessage(message1, index);
    			System.out.println("Your comment has been posted");
    			
    		} else if (message1.toLowerCase().contains("photo".toLowerCase())) {
    			System.out.println("To which photo do you want to add a comment?");	    			
    			news1.showallphotos();
    			message1 = scanner1.nextinput();
    			int number = Integer.parseInt(message1); 
    			int index = news1.findrightphoto(number);
    			index --;
    			
    			System.out.println("Please write your comment that you want to post:");
    			message1 = scanner1.nextinput();
    			news1.addcommenttophoto(message1, index);
    			System.out.println("Your comment has been posted");
    			
    		}else {
    			System.out.println("I'm sorry but that is not possible. Please try again.");
    		}
    		
    	}else if(wasgemachtwird.toLowerCase().contains("like".toLowerCase())) {
    		System.out.println("Do you want to like a photo or message?");
    		message1 = scanner1.nextinput();
    		if(message1.toLowerCase().contains("message".toLowerCase())) {
    			System.out.println("which message do you want to like?");
    			news1.showallmessages();
    			message1 = scanner1.nextinput();
    			/*if (message1 instanceof String) {
    				System.out.println("I'm sorry but that is not possible. Please try again.");
    			}else {*/
    			int number = Integer.parseInt(message1); 
    			int index = news1.findrightmessage(number);
    			index --;
    			news1.addlikemessage(index);
    			System.out.println("Your like has been posted");//}
    			
    		}else if(message1.toLowerCase().contains("photo".toLowerCase())) {
    			System.out.println("which photo do you want to like?");
    			news1.showallphotos();
    			message1 = scanner1.nextinput();
    			int number = Integer.parseInt(message1); 
    			int index2 = news1.findrightphoto(number);
    			index2 --;
    			news1.addlikephoto(index2);
    			System.out.println("Your like has been posted");
    			
    		}else {
    			System.out.println("I'm sorry but that is not possible. Please try again.");
    		}
    			
    	}else if(wasgemachtwird.toLowerCase().contains("remove".toLowerCase())){
    		System.out.println("Do you want to remove likes from a photo or message?");
    		message1 = scanner1.nextinput();
    		if(message1.toLowerCase().contains("message".toLowerCase())) {
    			System.out.println("which message do you want to like?");
    			news1.showallmessages();
    			message1 = scanner1.nextinput();
    			int number = Integer.parseInt(message1); 
    			int index = news1.findrightphoto(number);
    			index --;
    			System.out.println("Your like has been posted");
    			news1.removelikemessage(index);
    			
    		}else if(message1.toLowerCase().contains("photo".toLowerCase())) {
    			System.out.println("which photo do you want to dislike?");
    			news1.showallphotos();
    			message1 = scanner1.nextinput();
    			int number = Integer.parseInt(message1); 
    			int index = news1.findrightphoto(number);
    			index --;
    			news1.removelikephoto(index);
    			System.out.println("Your like has been posted");
    			
    		}else {
    			System.out.println("I'm sorry but that is not possible. Please try again.");
    		}
    		
    	}else if(wasgemachtwird.toLowerCase().contains("end".toLowerCase())){
    		System.out.println("Bye, bye.");
	    		
    	}
    	else {
    		System.out.println("I'm sorry but that is not possible. Please try again.");
    	}
    System.out.println("---------------------------------------------------------------------------------");
    
	}while(!wasgemachtwird.equals("end"));
	}
}

