public class Proximity implements ISenzori{
    private String tipSenzor;

    public Proximity(String tipSenzor) {
        this.tipSenzor = tipSenzor;
    }

    @Override
    public String nume() {
        return tipSenzor;
    }
}
