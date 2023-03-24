package final_test;

public abstract class BaseNotebook {
    int ramSize;
    int driveSize;
    String osType;
    String color;
    public BaseNotebook(int ramSize, int driveSize, String osType, String color) {
        this.ramSize = ramSize;
        this.driveSize = driveSize;
        this.osType = osType;
        this.color = color;
    }

}
