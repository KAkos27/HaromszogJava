package main;

public class HaromszogProgram {

    public static void main(String[] args) {
        new HaromszogProgram().haromszogKerulete();
    }

    private void haromszogKerulete() {
        Haromszog h;
        h = new Haromszog(3, 4, 5);
        String ki = h.oldalakAdatai();
        ki += "\n";
        ki += h.oldalakAdatai();
        System.out.println(ki);
    }

}
