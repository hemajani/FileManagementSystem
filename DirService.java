package Services;
import java.io.File;
import Entities.Dir;

public class DirService {
	
	    private static Dir fileDirectory = new Dir();
	    
	    public static void PrintFiles() {
	    	
	    	fileDirectory.fillFiles();

	        for (File file : DirService.getFileDir().getFiles())
	        {
	            System.out.println(file.getName());
	        }
	    }
	    public static Dir getFileDir() {
	        return fileDirectory;
	    }

	    public static void setFileDir(Dir fileDirectory) {
	        DirService.fileDirectory = fileDirectory;
	    }


	


}
