import java.util.ArrayList;


public class Katsed {
    public static void main(String[] args) {
        // 1. tund
        // loo Tund objekt
        Tund esimeneTund = new Tund();
        // lisa väärtused
        esimeneTund.tund = "2";
        esimeneTund.algus = "08:30";
        esimeneTund.lopp = "10:00";
        esimeneTund.aine = "Mobiilirakenduse kasutajaliidese disain";
        esimeneTund.grupp = "VS18";
        esimeneTund.opetaja = "Ly Otsa";
        esimeneTund.ruum = "Kopli A - A418 (arvutiklass)";

        // 2. tund
        // loo Tund objekt
        Tund teineTund = new Tund();
        // lisa väärtused
        teineTund.tund = "3";
        teineTund.algus = "10:15";
        teineTund.lopp = "11:45";
        teineTund.aine = "Mobiilirakenduse kasutajaliidese disain";
        teineTund.grupp = "VS18";
        teineTund.opetaja = "Ly Otsa";
        teineTund.ruum = "Kopli A - A418 (arvutiklass)";

        Tund kolmasTund = new Tund();
        // lisa väärtused
        kolmasTund.tund = "4";
        kolmasTund.algus = "11:55";
        kolmasTund.lopp = "14:00";
        kolmasTund.aine = "JAVA programmeerimine";
        kolmasTund.grupp = "VS18";
        kolmasTund.opetaja = "Anna Karutina";
        kolmasTund.ruum = "Kopli A - A411 (arvutiklass)";

        // 4. tund
        // loo Tund objekt
        Tund neljasTund = new Tund();
        // lisa väärtused
        neljasTund.tund = "5";
        neljasTund.algus = "14:10";
        neljasTund.lopp = "15:40";
        neljasTund.aine = "JAVA programmeerimine";
        neljasTund.grupp = "VS18";
        neljasTund.opetaja = "Anna Karutina";
        neljasTund.ruum = "Kopli A - A411 (arvutiklass)";

        System.out.println(kolmasTund);
        System.out.println(neljasTund);

        // 5. tund
        System.out.println(neljasTund);	        // loo Tund objekt
        Tund viiesTund = new Tund();
        // lisa väärtused
        viiesTund.tund = "6";
        viiesTund.algus = "15:45";
        viiesTund.lopp = "17:15";
        viiesTund.aine = "JAVA programmeerimine";
        viiesTund.grupp = "VS18";
        viiesTund.opetaja = "Anna Karutina";
        viiesTund.ruum = "Kopli A - A411 (arvutiklass)";

        // loo päev
        Paev esmaspaev = new Paev();
        esmaspaev.kuupaev = "2019-11-18";
        // lisame tunnid päevale
        ArrayList<Tund> tunnid = new ArrayList<Tund>();
        tunnid.add(esimeneTund);
        tunnid.add(teineTund);
        tunnid.add(kolmasTund);
        tunnid.add(neljasTund);
        tunnid.add(viiesTund);
        esmaspaev.tundideNimekiri = tunnid;



        System.out.println(esmaspaev);

    }
}