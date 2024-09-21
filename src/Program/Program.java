package Program;

import Entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numberOfRoom;
        String name, email;

        Product[] roomsLocate = new Product[10];

        for (int i = 0; i < roomsLocate.length; i++) {
            Product locate = new Product("Empty", "Empty", 0);
            roomsLocate[i] = locate;
            roomsLocate[i].room = i;

        }

        System.out.println("We have 10 rooms to locate , pls enter the room that you want : 0 - 9");


        System.out.println("How much students will locate a room ?");
        n = sc.nextInt();

        while (n > roomsLocate.length || n == 0) {
            if (n == 0) {
                System.out.println("You couldn't locate 0 rooms , pls enter another number");
                n = sc.nextInt();
            }
            System.out.println("We just have 10 rooms , pls enter another number");
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your Name");
            name = sc.next();

            System.out.println("Enter your email : ");
            email = sc.next();

            System.out.println("Enter the room that you want : ");
            numberOfRoom = sc.nextInt();

            while (roomsLocate[numberOfRoom].peopleInRoom != 0) {
                System.out.println("This room it's already rented , choose other room ");
                numberOfRoom = sc.nextInt();
                
            }

            roomsLocate[numberOfRoom].setName(name);
            roomsLocate[numberOfRoom].setEmail(email);
            roomsLocate[numberOfRoom].room = numberOfRoom;
            roomsLocate[numberOfRoom].peopleInRoom = 1;

            System.out.println("Your Email : " + roomsLocate[numberOfRoom].getEmail() + " , your name :  " + roomsLocate[numberOfRoom].getName() + " , your room : " + roomsLocate[numberOfRoom].room);
        }

        System.out.println("List of rooms : ");
        for (int i = 0; i < roomsLocate.length; i++) {
            System.out.println(roomsLocate[i].toString());
            System.out.println("-----------------");
        }


    }
}
