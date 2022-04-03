package exemple;

import java.awt.*;

import bandeau.Bandeau;

public class Zoom extends Effet{

    public Zoom(int r) {
        super(r);
    }

    public void joue(Bandeau b)
    {
        super.joue(b);
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(100);
        }
    }
}
