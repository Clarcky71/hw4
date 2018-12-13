package hw4;

public class Filtre2 {

	public Filtre2 () {

    }

	String valPrec;
	
    public void Filtre (String filtre){
        if (filtre.equals(valPrec)==false) {
        	valPrec = filtre;
            System.out.println("Filtre2 "+filtre);
        }

    }
	
}
