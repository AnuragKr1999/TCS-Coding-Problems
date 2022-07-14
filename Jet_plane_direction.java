

public class Jet_plane_direction {
    public static void main(String[] args) {
        
        String directions = "NNWESW";
        int x = 0, y = 0;

        for(int i=0; i<directions.length(); i++) {
            int ch = directions.charAt(i);

            switch(ch) {
                case 'N':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'E':
                    y++;
                    break;
                case 'W':
                    y--;
                    break;
            }
        }

        if(x==0 && y==0)
            System.out.println("Returned successfully");
        else
            System.out.println("Not Returned successfully");
    }
}
