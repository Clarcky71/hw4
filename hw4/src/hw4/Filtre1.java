package hw4;

public class Filtre1 {

	public Filtre1 () {

    }

    public String Filtre (String filtre,String num){

        if (filtre.equals("1")) {
            //System.out.println("D");
            return "Sensor "+num+": D";

        }

        else if (filtre.equals("0")){
            //System.out.println("N");
        	return "Sensor "+num+": N";
        }

        else {

            System.out.println("Erreur de lecture");
            System.out.println(filtre);
            return "Bug";

        }

    }
		
}
