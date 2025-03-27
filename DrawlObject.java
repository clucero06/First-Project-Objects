import javafx.scene.paint.*;
import javafx.scene.canvas.*;

public abstract class DrawlObject {
    private float x;
    private float y;

    public DrawlObject(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void draw(float playerx, float playery, GraphicsContext gc, boolean isPlayer) {
        if (isPlayer)
            drawMe(playerx, playery, gc);
        else
            drawMe(-playerx + 300 + x, -playery + 300 + y, gc);
    }

    public abstract void drawMe(float x, float y, GraphicsContext gc);

    public float getX() { return x; }
    public float getY() { return y; }
    public void setX(float x_) { x = x_; }
    public void setY(float y_) { y = y_; }
    
    public double distance(DrawlObject other) {
        return Math.sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y));
    }
}
