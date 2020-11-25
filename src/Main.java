public class Main {
    public static void main(String[] args) {
        Panouri panouri = new Panouri("Ramses RMNM");
        Panouri panouri2 = new Panouri("Ramses CXM");

        Camera camera = new Camera("Camera 5000");
        Temperature temperature1 = new Temperature("De temperatura");
        Proximity proximity = new Proximity("Proximitate");
        Lidar lidar = new Lidar("Lidar");



        camera.setDetectStrategy(new DetectiaPersoanelor());
        panouri.addCamera(camera);
        panouri.addSenzor(temperature1);
        panouri.addSenzor(proximity);
        panouri.addSenzor(lidar);


        System.out.println(panouri.getSenzori());
    }
}
