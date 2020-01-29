import java.util.List;
import java.util.Map;

public class Tunniplaan {
    public String nadal;
    public String paev;
    public Map<String, List<Tund>> tunnid;

    @Override
    public String toString() {
        return "Tunniplaan:" +
                "\nnadal:\n" + nadal +
                "\npaev:\n" + paev +
                "\ntunnid:\n" + tunnid
                ;
    }
}