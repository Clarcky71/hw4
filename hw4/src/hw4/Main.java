package hw4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	

	public static void main(String[] args) {
		ArrayList<String> sensorInfo=new ArrayList<String>();
		int num =0;

		try{
			InputStream flux=new FileInputStream("hw4/Ressource/sensorList.txt");
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				
				if(ligne.length()!=0){
					sensorInfo.add(ligne);
					if(sensorInfo.size()==3){
						Traitement t = new Traitement(Integer.toString(num),sensorInfo);
						t.start();
						num++;
						sensorInfo.clear();
					}
				}
			    
			}
			buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}

	}

}
