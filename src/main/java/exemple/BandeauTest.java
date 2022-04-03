package exemple;

import java.util.ArrayList;

import bandeau.Bandeau;

public class BandeauTest {
    public static void main(String[] args) {
        new BandeauTest().exemple();
    }

    public void exemple()
    {
        Bandeau b = new Bandeau();
        ArrayList <Effet> e = new ArrayList<>();
        Scenario s = new Scenario(e);

        Zoom z = new Zoom(2);
        Tourne t = new Tourne(1);
        Couleur c = new Couleur(1);

        s.ajouterEffet(z);
        s.ajouterEffet(t);
        s.ajouterEffet(c);

        s.jouer(b);
    }
}
