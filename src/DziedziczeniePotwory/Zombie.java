package DziedziczeniePotwory;

public class Zombie extends Potwor {

    @Override
    void opis() {

    }

    public Zombie()
    {
        System.out.println("Domyślny konstr kla Zombie");
    }
    public Zombie(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstr kla Zombie");
    }
}
