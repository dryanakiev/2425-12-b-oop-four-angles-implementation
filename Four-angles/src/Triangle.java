public class Triangle extends Figure {
    private int sideC;

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(){
    }

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA,sideB);

        this.sideC = sideC;
    }

    @Override
    public int outerEdge() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double innerFace() {
        double halfPerimiter = outerEdge()/2;
        return Math.sqrt(halfPerimiter*((halfPerimiter-getSideA()) * (halfPerimiter-getSideB()) * (halfPerimiter-getSideC())));
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
