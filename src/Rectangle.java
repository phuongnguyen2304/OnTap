import java.io.Serializable;

public class Rectangle implements Serializable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle [Width=" + width + ", Height=" + height + ", Area=" + getArea() + "]";
    }
}

