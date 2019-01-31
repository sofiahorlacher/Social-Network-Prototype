
public class Timestamp {
	
	public static String timeString(long time)
	   {
	   long current = System.currentTimeMillis();
       long pastMillis = current - time;  
	   long seconds = pastMillis/1000;
	   long minutes = seconds/60;
	   if(minutes > 0) {
	     	System.out.println(minutes + " minutes ago");
	        return minutes + " minutes ago";
	   }
	    else {
	      	System.out.println(seconds + " seconds ago");
	        return seconds + " seconds ago";
	    }
	    }
	

}
