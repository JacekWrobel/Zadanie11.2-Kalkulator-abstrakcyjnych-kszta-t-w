public class Test {
    public static void main(String[] args) {
        ShapeCalcualtor scalc = new ShapeCalcualtor();

        Circle circle = new Circle(2.5);
        System.out.println(scalc.circleArea(circle));

        Cube cube = new Cube(5);
        System.out.println(scalc.cubeVolume(cube));

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(scalc.rectangleArea(rectangle));

        Ball ball = new Ball(3);
        System.out.println(scalc.ballVolume(ball));
    }
}
