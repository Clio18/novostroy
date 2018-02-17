public class FlatConsistent extends Flat {
    int numberOfWindows;
    double squereOfRoom;
    boolean free;

    public FlatConsistent(int number, int floor, double square, double value, int numberOfWindows, double squereOfRoom, boolean free) {
        super(number, floor, square, value);
        this.numberOfWindows = numberOfWindows;
        this.squereOfRoom = squereOfRoom;
        this.free = free;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public double getSquereOfRoom() {
        return squereOfRoom;
    }

    public void setSquereOfRoom(double squereOfRoom) {
        this.squereOfRoom = squereOfRoom;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
