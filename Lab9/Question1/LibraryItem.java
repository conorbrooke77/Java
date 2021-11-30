package Lab9.Question1;

public class LibraryItem {
    private String type;
    private String ID;

    public LibraryItem(String type, String ID){
        setType(type);
        setID(ID);
    }

    public void setType(String type) {
        this.type = type;
    }   

    public String getType() {
        return type;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID(String ID) {
        return ID;
    }

    public String toString() {
        return "\nType: " + type + "\nID: " + ID;
    }
}
