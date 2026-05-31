import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {
        System.out.println("Skład zespołu projektu: " + nazwaProjektu);
        for (Pracownik p : pracownicy) {
            System.out.println(p.toString());
        }
    }

    public double policzLacznyKoszt() {
        double lacznyKoszt = 0;
        for (Pracownik p : pracownicy) {
            lacznyKoszt += p.obliczKosztMiesieczny();
        }
        return lacznyKoszt;
    }

    public void wypiszTesterowAutomatyzujacych() {
        System.out.println("Testerzy automatyzujący w zespole:");
        for (Pracownik p : pracownicy) {
            if (p instanceof Tester) {
                Tester tester = (Tester) p;
                if (tester.isCzyAutomatyzujacy()) {
                    System.out.println(tester.przedstawSie());
                }
            }
        }
    }
}