package exemple;

import bandeau.Bandeau;

public class Tourne extends Effet{

    public Tourne(int r) {
        super(r);
    }

    public void joue(Bandeau b)
    {
        super.joue(b);
        for (int i = 0; i <= 100; i++) {
            b.setRotation(2 * Math.PI * i / 100);
            b.sleep(25);
        }
    }
}
