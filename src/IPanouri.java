import java.util.List;

public interface IPanouri extends ISenzori,ICamera {
    List<ISenzori> getSenzori();
    List<ICamera> getCamere();
    void addSenzor(ISenzori senzori);
    void addCamera(ICamera camere);
    void print();
}
