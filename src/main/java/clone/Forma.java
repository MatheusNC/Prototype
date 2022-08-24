package clone;

public class Forma implements Prototype{
    protected int X;
    protected int Y;

    public Forma(){}

    public Forma(int x, int y) {
        X = x;
        Y = y;
    }

    public Forma(Forma forma) {
        if (forma != null) {
            this.X = forma.X;
            this.Y = forma.Y;
        }
    }

    @Override
    public Forma clone() {
        return new Forma(this);
    }

    @Override
    public String toString() {
        return "Forma{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
