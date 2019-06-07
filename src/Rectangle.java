public class Rectangle extends GeometricShape {
double high;
double podstawa;

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }

    public Rectangle(double high, double podstawa) {
        this.high = high;
        this.podstawa = podstawa;
    }
}
