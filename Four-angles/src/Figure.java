//------------------------Дефиниция на абстрактен клас Figure-------------------------------
public abstract class Figure {
    private int sideA;
    private int sideB;
    //------------------------Дефиниция на конструктор без аргументи-------------------------------
    public Figure() {
    }
    //------------------------Дефиниция на конструктор с аргументи-------------------------------
    public Figure(int width, int height) {
        this.sideA = width;
        this.sideB = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public abstract int outerEdge();

    public abstract double innerFace();

    @Override
    public String toString() {
        return "Figure";
    }
}