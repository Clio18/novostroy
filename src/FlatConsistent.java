public class FlatConsistent {
    int number;
    int floor;
    double square;
    double value;
    private int numberOfWindows;
    private double squereOfRoom;
    private boolean free;

    public FlatConsistent(int number, int floor, double square, double value, int numberOfWindows, double squereOfRoom, boolean free) {
        this.number = number;
        this.floor = floor;
        this.square = square;
        this.value = value;
        this.numberOfWindows = numberOfWindows;
        this.squereOfRoom = squereOfRoom;
        this.free = free;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
