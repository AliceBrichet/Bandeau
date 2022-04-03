package exemple;

import java.util.ArrayList;

import bandeau.Bandeau;

public class Scenario {
    private ArrayList<Effet> effets; 

    // Constructeur 
    public Scenario(ArrayList<Effet> e)
    {
        this.effets = e;
    }

    //Getter et Setter

    public ArrayList<Effet> getListEffets()
    {
        return this.effets;
    }

    public void setListEffets(ArrayList<Effet> e)
    {
        this.effets=e;
    }

    //Méthodes 

    public void ajouterEffet(Effet e)
    {
        this.effets.add(e);
    }

    public void supprimerEffet(Effet e)
    {
        if(parcourirEffet(e)==true)
        {
            this.effets.remove(e);
        }
    }

    public boolean parcourirEffet(Effet e)
    {
        for(Effet n: effets)
        {
            if(n==e)
            {
                return true;
            }
        }
        return false;
    }

    public void jouer(Bandeau b)
    {
        for (Effet n:effets)
        {
            n.repetition(b);
        }
    }
}
