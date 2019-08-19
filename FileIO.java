package fileio;
import java.io.*;

public class FileIO {

	public static void createFile() throws IOException{
		//file to create "dummy.txt"
		File file =new File("dummy.data");
		
		//creates the file
		if(file.createNewFile())
			System.out.println("dummy.txt File Created");
		else
			System.out.println("File already exists");
		
	}
	
	
	public static void deleteFile() throws IOException{
		// file to delete 
		File file =new File("dummy.data");
		
		// deletes the file
		if(file.delete())
			System.out.println("dummy.txt File Deleted");
		else
			System.out.println("File doesn't exist");
	
	}
	
	
	public static void listDir(final String pathToFolder) {
		File file= new File(pathToFolder);
		
		//if file is not a directory return
		if(!file.isDirectory()) {
			System.out.println("file is not a directory");
			return;
		}
		//get all the files & directories
		String files[]=file.list();
		
		//Display them
		for(String f: files)
			System.out.println(f);
		
	}
	
	public static void writeFile() throws IOException{
		//Set the output stream in order to write to the file "Output data to the file"
		FileOutputStream out= new FileOutputStream("dummy.data");
		
		//create a byte array
		byte b[]= new byte[]{10,20,30};
		
		//write the array to file
		out.write(b);
		System.out.println("wrote to file");
		
		out.close();
	}
	
	public static void readFile() throws IOException{
		//Set the input stream in order to read from file "Input data from the file"
		FileInputStream in= new FileInputStream("dummy.data");
		
		//create a byte array
		byte b[]= new byte[3];
		
		//read from the file
		in.read(b);
		
		for(byte x: b)
			System.out.print(x+" ");
		
		in.close();
	}
	
	
	
	public static void main(String[] args) throws IOException{
		createFile();
		//deleteFile();
		//listDir("/Users/chrismayol/Downloads");
		//writeFile();
		//readFile();
		
	}

}
