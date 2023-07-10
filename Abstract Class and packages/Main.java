import vol.Cylinder;
public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        double volume = cylinder.volume();
        System.out.println("Volume of Cylinder: " + volume);
    }
}

