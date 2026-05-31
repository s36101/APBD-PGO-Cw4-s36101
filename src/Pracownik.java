import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;
    }

    public String przedstawSie() {
        return "Nazywam się " + imie + " " + nazwisko + ".";
    }

    @Override
    public String toString() {
        return "Pracownik [ID: " + idPracownika + ", Imię i Nazwisko: " + imie + " " + nazwisko + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pracownik pracownik = (Pracownik) obj;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }
}