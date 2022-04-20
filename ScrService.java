package Services;

import Screen.OptionsImplementation;
import Screen.screen;
import Screen.FirstPage;
import Entities.Dir;


public class ScrService {

		
		//static Directory dir = new Directory();
		
		
		
		public static FirstPage FirstPage = new FirstPage();
	    public static OptionsImplementation OptionsImplementation = new OptionsImplementation();
	    
	    

	    public static screen CurrentScreen = FirstPage;

	    
	    public static screen getCurrentScreen() {
	        return CurrentScreen;
	    }

	    
	    public static void setCurrentScreen(screen currentScreen) {
	        CurrentScreen = currentScreen;
	    }
	    
}
