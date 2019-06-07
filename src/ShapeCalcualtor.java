public class ShapeCalcualtor extends LIneCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        double pole = circle.radius * Shape.PI;
        return pole;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double pole = 0.5 * rectangle.high * rectangle.podstawa;

        return pole;
    }

    @Override
    public double ballVolume(Ball ball) {
        double objetosc = (4/3*Shape.PI);
        return objetosc;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double objetosc = cube.podstawa*cube.podstawa*cube.podstawa;
        return objetosc;
    }
}
