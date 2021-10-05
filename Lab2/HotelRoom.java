package Lab2;

public class HotelRoom {

    private int roomNumber;
    private boolean vacant;
    private double rate;
    private String roomType;

    public HotelRoom() {

    }

    public HotelRoom(int roomNumber, String roomType, boolean occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
        vacant = occupied;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setOccupied(boolean vacant) {
        this.vacant = vacant;
    }

    public boolean isOccupied() {
        return vacant;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
