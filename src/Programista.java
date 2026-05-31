public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public void wypiszTechnologie() {
        System.out.println("Główny język programowania to: " + glownyJezyk);
    }

    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa() * (liczbaRepozytoriow * 100);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " Jestem proramistą języka " + glownyJezyk + ".";
    }

    @Override
    public String toString() {
        return super.toString() + " - Rola: Programista (" + glownyJezyk + ")";
    }
}