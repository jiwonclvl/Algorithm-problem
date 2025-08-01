import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentRoom = sc.nextInt();
        int room = 1;
        int increment = 6;

        if (currentRoom == 1) {
            System.out.print(room);
            return;
        }

        for (int i = 1; i < currentRoom; i++) {
            room = room + increment;
            increment += 6;

            if (currentRoom < room || currentRoom == room) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}