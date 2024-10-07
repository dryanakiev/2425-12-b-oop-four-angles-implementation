public class Square extends Figure{
    public Square(int side) {
        super(side, side);
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
        return "Square";
    }
}
