package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class Couleur extends Effet{

    public Couleur(int r) {
        super(r);
    }

    public void joue(Bandeau b)
    {
        super.joue(b);
        b.setBackground(Color.LIGHT_GRAY);
    }
}
