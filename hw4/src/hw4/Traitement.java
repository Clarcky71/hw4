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
	Filtre1 filtre1 = new Filtre1();
	Filtre2 filtre2 = new Filtre2();
	
	public Traitement(String name, ArrayList<String> info){  
		super(name);
		sid=info.get(0);
		freq=Integer.parseInt(info.get(1).replace("FRQ: ", ""));
		link=info.get(2).replace("LNK: ", "");
	}
	  
	public void run(){
			while(true){
			try{
				InputStream flux=new FileInputStream(this.link); 
				InputStreamReader lecture=new InputStreamReader(flux);
				BufferedReader buff=new BufferedReader(lecture);
				String ligne;
				while ((ligne=buff.readLine())!=null){
					//filtre1 affiche les valeurs des sensors en continue
					System.out.println(filtre1.Filtre(ligne,this.sid));
					
					//filtre2 affiche les valeurs des sensors seulement si changement
					filtre2.Filtre(filtre1.Filtre(ligne,this.sid));
			    
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
