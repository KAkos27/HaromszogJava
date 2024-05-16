package teszt;

import main.Haromszog;

public class TeszHaromszog {

    public static void main(String[] args) {
        new TeszHaromszog().tesztesetek();
    }

    private void tesztesetek() {
        System.out.println("Szabályos háromszög (3, 3, 3)");
        Haromszog hr = new Haromszog(3, 3, 3);
        String kapott = hr.oldalakAdatai();
        String vart = "a=3, b=3, c=3";
        assert kapott == vart : "Hiba";

        System.out.println("");
        hr = new Haromszog(20, 3, 3);
        kapott = hr.oldalakAdatai();
        vart = "a=1, b=1, c=1";
        assert kapott == vart : "Hiba";

        hr = new Haromszog(-3, 3, 3);
        kapott = hr.oldalakAdatai();
        vart = "a=3, b=3, c=3";
        assert kapott == vart : "Hiba";

        hr = new Haromszog(-20, 3, 3);
        kapott = hr.oldalakAdatai();
        vart = "a=1, b=1, c=1";
        assert kapott == vart : "Hiba";
    }
}
