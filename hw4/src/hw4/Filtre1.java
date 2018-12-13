package hw4;

public class Filtre1 {

	public Filtre1 () {

    }

    public String Filtre (String filtre,String num){

        if (filtre.equals("1")) {
            return "Sensor "+num+": D";

        }

        else if (filtre.equals("0")){
        	return "Sensor "+num+": N";
        }

        else {
            System.out.println("Erreur de lecture");
            return "Bug";
        }

    }
		
}
