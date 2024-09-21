package Entities;

public class Product {
    private String email;
    private String name;
    public int peopleInRoom;
    public int room;

    public Product(String email, String name, int peopleInRoom) {
        this.email = email;
        this.name = name;
        this.peopleInRoom = peopleInRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Rooms : " +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", room=" + room;
    }
}
