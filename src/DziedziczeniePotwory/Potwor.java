package DziedziczeniePotwory;

public abstract class Potwor {
    public double predkoscChodzenia = 20;
    public double zywotnosc;

    public void atakuj ()
    {
        System.out.println("To jest metoda atakuj z klasy Potwór");
    }

    abstract void opis ();

    public Potwor()
    {
        System.out.println("Domyślny kontrk z klasy Potwór");
    }

    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nieomyślny kontrk z klasy Potwór");
    }
}
