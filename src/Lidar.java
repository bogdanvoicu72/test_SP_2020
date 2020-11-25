public class Lidar implements ISenzori{
    private String tipSenzor;

    public Lidar(String tipSenzor) {
        this.tipSenzor = tipSenzor;
    }

    @Override
    public String nume() {
        return tipSenzor;
    }
}
