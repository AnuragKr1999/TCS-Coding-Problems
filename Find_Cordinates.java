/* Problem Statement:
    Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme.
    He first turns and travels 10 units of distance
    His second turn is upward for 20 units
    Third turn is to the left for 30 units
    Fourth turn is the downward for 40 units
    Fifth turn is to the right(again) for 50 units
    … And thus he travels, every time increasing the travel distance by 10 units.

    Find the coordinate if he takes n such turns
*/

public class Find_Cordinates {
    public static void main(String args[]) {

        int n = 7;
        find_coordinates(n);
    }

    public static void find_coordinates(int n) {

        int nCopy = n;
        int dist = 10;
        int x = 0, y = 0;
        char direction = 'R';


        while(nCopy > 0) {
            switch(direction) {
                case 'R': // Right
                    x = x + dist;
                    dist = dist + 10;
                    direction = 'U';
                    break;

                case 'U': // Up
                    y = y + dist;
                    dist = dist + 10;
                    direction = 'L';
                    break;

                case 'L': // Left
                    x = x - dist;
                    dist = dist + 10;
                    direction = 'D';
                    break;

                case 'D': // Right
                    y = y - dist;
                    dist = dist + 10;
                    direction = 'A';
                    break;

                case 'A': // Right again
                    x = x + dist;
                    dist = dist + 10;
                    direction = 'R';
                    break;
            }
            nCopy--;
        }

        System.out.println("Coordinates for " + n + " : " + x + ", " + y);
    }
}