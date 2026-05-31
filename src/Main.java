public class Main {
    public static void main(String[] args) {
        ZespolProjektowy zespol = new ZespolProjektowy("Software House");

        Pracownik p1 = new Programista("P1", "Artur", "Tomala", 10000.0, "Java", 4);
        Pracownik p2 = new Tester("P2", "Kamil", "Dodatkowy", 7000.0, true, 25);
        Pracownik p3 = new Programista("P3", "Beata", "Nowa", 12500.0, "Python", 3);

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(p2);
        zespol.dodajPracownika(p3);

        System.out.println("RAPORT ZESPOŁU");
        zespol.wypiszSkladZespolu();
        System.out.println("Łączny koszt zespołu: " + zespol.policzLacznyKoszt() + " PLN");

        System.out.println("PRZEDSTAWIENIE PRACOWNIKÓW");
        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());
        System.out.println(p3.przedstawSie());

        System.out.println("AKCJE SPECYFICZNE");
        if (p1 instanceof Programista) {
            Programista programista = (Programista) p1;
            programista.wypiszTechnologie();
        }

        System.out.println("PORÓWNANIE OBIEKTÓW");
        System.out.println("Czy Piotr to ten sam pracownik po ID? " + p2.equals(new Tester("P2", "Inne", "Dane", 9000.0, false, 10)));

        System.out.println("INFORMACJE O TESTERZE");
        System.out.println(p2);
    }
}