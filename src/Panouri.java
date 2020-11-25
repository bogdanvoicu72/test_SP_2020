import java.util.ArrayList;
import java.util.List;

public class Panouri implements IPanouri{

    private String nume;
    private List<ISenzori> senzoriMasini = new ArrayList<>();
    private List<ICamera> camereMasini = new ArrayList<>();

    public Panouri(String nume) {
        this.nume = nume;
    }

    @Override
    public List<ISenzori> getSenzori() {
        return senzoriMasini;
    }

    @Override
    public List<ICamera> getCamere() {
        return camereMasini;
    }

    @Override
    public void addSenzor(ISenzori senzori) {
        senzoriMasini.add(senzori);

    }

    @Override
    public void addCamera(ICamera camere) {
        camereMasini.add(camere);

    }

    @Override
    public void print() {
        System.out.println(getSenzori());
    }

    @Override
    public String nume() {
        return nume;
    }
}
