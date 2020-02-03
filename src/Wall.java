import java.awt.*;

public class Wall extends Thing {
    final static int WIDTH = 10; // px

    int i1, i2, j;
    boolean isVertical;

    public Wall(int x, int y, int length, boolean isVertical) {
        super(null);
        this.isVertical = isVertical;
        if (isVertical) {
            this.i1 = y;
            this.i2 = y + length;
            this.j = x;
            this.shape = new Rectangle(x, y, Wall.WIDTH, length);

        } else {
            this.i1 = x;
            this.i2 = x + length;
            this.j = y;
            this.shape = new Rectangle(x, y, length, Wall.WIDTH);
        }

    }

    public void draw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        int width = (this.isVertical) ? Wall.WIDTH : this.i2 - this.i1;
        int height = (this.isVertical) ? this.i2 - this.i1 : Wall.WIDTH;
        graphics.fillRect(this.getX(), this.getY(), width, height);
        this.shape = new Rectangle(this.getX(), this.getY(), width, height);
    }
}
