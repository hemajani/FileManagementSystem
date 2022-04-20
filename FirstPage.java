package Screen;
import Services.DirService;
import Services.ScrService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstPage implements screen{
	
	    private String welcomeString = "Welcome to SimpliLearn Project1!";
	    private String devString = "Developer: Hema";

	    private ArrayList<String> options = new ArrayList<>();


	    public FirstPage() {
	        options.add("1. Show Files");
	        options.add("2. Show File Options Menu");
	        options.add("3. Quit");

	    }
	    
	    public void introPage() {
	    	System.out.println(welcomeString);
	        System.out.println(devString);
	        System.out.println("\n");
	        Display();
	    }
	    
	    
	    
	    @Override
	    public void Display() {
	    	System.out.println("Main Menu");
	        for (String s : options)  {
	            System.out.println(s);
	        }

	    }

	    public void GetInput() {
	        int selectedOption  = 0;
	        while ((selectedOption = this.getOption()) != 3) {
	            this.Option(selectedOption);
	        }
	    }

	    @Override
	    public void Option(int option) {
	        switch(option) {

	            case 1: // Show Files in Directory
	                this.ShowFiles();
	                
	                this.Display();
	                
	                break;
	                
	            case 2: // Show File Options menu
	            	ScrService.setCurrentScreen(ScrService.OptionsImplementation);
	            	ScrService.getCurrentScreen().Display();
	            	ScrService.getCurrentScreen().GetInput();
	                
	                this.Display();
	                
	                break;
	                
	            default:
	                System.out.println("Invalid Option");
	                break;
	        }
	        
	    }

	    public void ShowFiles() {

	        //TODO: Get the files from the Directory
	    	
	    	//Finished TODO Task

	        System.out.println("List of Files: ");
	    	DirService.PrintFiles();

	    }
	    
	    private int getOption() {
	        Scanner in = new Scanner(System.in);

	        int returnOption = 0;
	        try {
	            returnOption = in.nextInt();
	        }
	        catch (InputMismatchException ex) {

	        }
	        return returnOption;

	    }

		@Override
		public void NavigateButton(int Button) {
			// TODO Auto-generated method stub
			
		}
	}



