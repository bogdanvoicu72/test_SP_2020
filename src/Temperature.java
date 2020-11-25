public class Temperature implements ISenzori{
    private String tipSenzor;

    public Temperature(String tipSenzor) {
        this.tipSenzor = tipSenzor;
    }

    @Override
    public String nume() {
        return tipSenzor;
    }
}
