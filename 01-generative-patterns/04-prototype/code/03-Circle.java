public class Circle extends Shape {

    private int radius;

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public Shape clone() {
        return new Circle(this)
    }
}