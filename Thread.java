package Codes;
import java.io.*;
import java.lang.Object;
import java.nio.file.Files;
public class Thread {
	static int num ;
	public void setVar(int num){
		this.num = num   ;
	}
	public int getvar(){
		return num ;
	}

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		//String n = String.valueOf(args[0]) ;
		//int ns = Integer.parseInt(n);
		System.out.println(String.valueOf(args[0]));
		return null;
		
		//String[] cmd = { s, Integer.toString(n) };
		//Process pro=Runtime.getRuntime().exec(cmd);
		 * 
		 */
		int var ;
		Thread t = new Thread();
		var = t.getvar();
		System.out.println(var);
		
		File ThreadFile = new File("/home/nishant/Desktop/Lock_files/Thread"+var+"lock.txt");
		boolean bool = false;
		try{
			bool = ThreadFile.createNewFile();
			System.out.println("Thread"+var+"lock.txt file created");
		}catch (IOException ioe){
			System.out.println("IO Exception");
		}
		//File dest = new File(" ");
		ThreadFile.renameTo(new File("/home/nishant/Desktop/Log_files/"+ ThreadFile.getName()));
	     //Path source = "/home/nishant/Desktop/Lock_files/Thread"+var+"lock.txt" ;
	     //Path newdir = "/home/nishant/Desktop/Log_files/Thread"+var+"lock.txt" ;
	     //Files.copy(source, newdir.resolve(source.getFileName()));
		//Files.move(Path.get("/home/nishant/Desktop/Lock_files/Thread"+var+"lock.txt"), Path.get("/home/nishant/Desktop/Log_files/Thread"+var+"lock.txt"));
		//ThreadFile.delete();
	}

}

