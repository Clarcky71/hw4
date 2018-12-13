package hw4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Traitement extends Thread {
	String sid;
	int freq;
	String link;
	
	public Traitement(String name, ArrayList<String> info){  
		super(name);
		sid=info.get(0);
		freq=Integer.parseInt(info.get(1).replace("FRQ: ", ""));
		link=info.get(2).replace("LNK: ", "");
	}
	  
	public void run(){
			/*System.out.println(this.getName());
			System.out.println(this.sid);
			System.out.println(this.freq);
			System.out.println(this.link);*/
			while(true){
			try{
				InputStream flux=new FileInputStream(this.link); 
				InputStreamReader lecture=new InputStreamReader(flux);
				BufferedReader buff=new BufferedReader(lecture);
				String ligne;
				while ((ligne=buff.readLine())!=null){
					System.out.println(this.sid);
					System.out.println(ligne);
			    
				}
				buff.close(); 
			}		
			catch (Exception e){
				System.out.println(e.toString());
			}
			
			try {
				sleep(this.freq);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}	
	}       
}
