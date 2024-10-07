public class Rectangle extends Figure {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int outerEdge() {
        return 2 * (getSideA() + getSideB());
    }

    @Override
    public double innerFace() {
        return getSideA() * getSideB();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
