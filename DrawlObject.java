import javafx.scene.paint.*;
import javafx.scene.canvas.*;

public abstract class DrawlObject {
    private double x;
    private double y;

    public DrawlObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public abstract void draw(GraphicsContext gc, double camX, double camY);

    public static double distance(DrawlObject a, DrawlObject b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
