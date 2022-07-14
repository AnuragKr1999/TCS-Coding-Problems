public class Non_repeating_digits {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 200;
        int counter = 0;

        for(int n = n1; n <= n2; n++) {

            boolean[] visited = new boolean[10];

            int x = n;
            boolean flag = true;
            while(x>0) {
                int digit = x%10;
                
                if(!visited[digit]) visited[digit] = true;
                else {
                    flag = false;
                    break;
                }
                x = x/10;
            }
            if(flag) counter++;

        }

        System.out.println(counter);
    }
}
