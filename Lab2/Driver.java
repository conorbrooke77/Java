package Lab2;

// Answer to questions 1, 2, 3 and 4 in lab 2;
public class Driver {
    public static void main(String[] args) {

        //Initializes the attributes of the HotelRoom instance;
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setOccupied(true);
        roomA.setRate(100);

        HotelRoom roomB = new HotelRoom();
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setOccupied(false);
        roomB.setRate(80);

        // Checks if the room is occupied first, if not then changes state to true;
        if (!roomB.isOccupied()) {
            roomB.setOccupied(true);
        }

        //Prints out the attributes values
        System.out.println("roomA number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType() + ", rate is " + roomA.getRate() + ", occupied " + roomA.isOccupied());
        System.out.println("roomB number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + ", rate is " + roomB.getRate() + ", occupied " + roomB.isOccupied());

        HotelRoom roomC = new HotelRoom(202, "Single", false, 90);
        System.out.println("roomC number is " + roomC.getRoomNumber() + ", type is " + roomC.getRoomType() + ", rate is " + roomC.getRate() + ", occupied " + roomC.isOccupied());
    }
}
