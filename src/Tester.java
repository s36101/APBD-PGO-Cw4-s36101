public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchmiam raport dla " + liczbaScenariuszy + " scenariuszy testowych.");
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double dodatek + czyAutomatyzujacy ? 2000.0 : 0.0;
        return getStawkaBazowa() + dodatek;
    }

    @Override
    public String przedstawSie() {
        String typ = czyAutomatyzujacy ? "automatyzującym" : "manualnym";
        return super.przedstawSie() + " Jestem testerem " + typ + ".";
    }

    @Override
    public String toString() {
        String typ = czyAutomatyzujacy ? "Automatyzujący" : "Manualny";
        return super.toString() + " - Rola: Tester (" + typ + ")";
    }
}