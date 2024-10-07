public class Main {
    public static void main(String[] args) {
        Figure figureOne = new Square(10);
        Figure figureTwo = new Rectangle(10,30);
        Figure figureThree = new Triangle(10,50,20);

        System.out.println("Outer edge of " + figureOne.toString() + " is :" + figureOne.outerEdge());
        System.out.println("Inner face of " + figureOne.toString() + " is :" + figureOne.innerFace());

        System.out.println("Outer edge of " + figureTwo.toString() + " is :" + figureTwo.outerEdge());
        System.out.println("Inner face of " + figureTwo.toString() + " is :" + figureTwo.innerFace());

        System.out.println("Outer edge of " + figureThree.toString() + " is :" + figureThree.outerEdge());
        System.out.println("Inner face of " + figureThree.toString() + " is :" + figureThree.innerFace());
    }
}
