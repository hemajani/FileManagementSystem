package Entities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Dir {
	


	   public static final String location = "src/main/directory/";
	   String fileName = this.getInputString();
	   private String getInputString() {

	        Scanner in = new Scanner(System.in);
	        return(in.nextLine());

	    }


	    private ArrayList<File> files = new ArrayList<File>();
	    
	    Path path = FileSystems.getDefault().getPath(location).toAbsolutePath();
	    
	    File Dfiles = path.toFile();
	       
	    public String getName() {
	        return location;
	    }
	    
	    public void print() {
	    	System.out.println("Existing Files: ");
	    	files.forEach(f -> System.out.println(f));
	    }

	    public ArrayList<File> fillFiles() {
	    	
	        File[] directoryFiles = Dfiles.listFiles();
	        
	        
	        
	    	files.clear();
	    	for (int i = 0; i < directoryFiles.length; i++) {
	    		if (directoryFiles[i].isFile()) {
	    			files.add(directoryFiles[i]);
	    		}
	    	}
	    	
	    	Collections.sort(files);
	    	
	    	return files;
	    }

	    public ArrayList<File> getFiles() {
	    	
	    	fillFiles();
	    	return files;
	    }
	    
	    
	    public void mergeSort() {
	    	
	    }

		public static String Location() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	}
