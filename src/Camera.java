public class Camera {
    private String numeCamera;
    private DetectStrategy detectStrategy = new DetectiaPersoanelor();

    public Camera(String tipSenzori) {
        this.numeCamera = numeCamera;
    }

    public DetectStrategy getDetectStrategy() {
        return detectStrategy;
    }

    public void setDetectStrategy(DetectStrategy detectStrategy) {
        this.detectStrategy = detectStrategy;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "tipSenzori='" + numeCamera + '\'' +
                ", detectStrategy=" + detectStrategy +
                '}';
    }
}
