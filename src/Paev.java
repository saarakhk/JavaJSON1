import java.util.List;

public class Paev {
    public String nimi;
    public String kuupaev;
    public List<Tund> tundideNimekiri;

    @Override
    public String toString() {
        return "\nNimi" +  nimi +
                "\nPaev: " +
                "\nkuupaev: " + kuupaev +
                "\nTunnid: " + tundideNimekiri +
                "\n";
    }
}