package hw4;

public class Filtre1 {

    public Filtre1 ()
    {

    }
    public void Filtre (String filtre)
    {
        if (filtre == "1") {
            System.out.println("D");
        }
        else if (filtre == "0")
            System.out.println("N");
        else {
            System.out.println("Erreur de lecture");
            System.out.println(filtre);
        }
    }
}
