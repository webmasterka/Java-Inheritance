package DziedziczeniePotwory;

public class Szkielet extends Potwor {
    String typBroni;

    @Override
    public void atakuj ()
    {
        super.atakuj();
        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }

    @Override
    void opis() {

    }

    public Szkielet()
    {
        System.out.println("Domyślny konstr kla Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstr kla Szkielet z dwoma argumentami");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
    {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyślny konstr kla Szkielet");
    }
}
