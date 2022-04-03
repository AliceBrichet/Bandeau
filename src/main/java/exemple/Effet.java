package exemple;

import bandeau.Bandeau;

public class Effet {
    private int repetition;

    //Constructeur 
    public Effet(int r)
    {
        this.repetition = r;
    }

    public void repetition(Bandeau b)
    {
        for(int i=1;i<=this.repetition;i++)
        {
            joue(b);
        }
    }

    public void joue(Bandeau b) {
        b.setMessage("Hello");
    }
}

