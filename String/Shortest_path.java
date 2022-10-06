/* Given a route containing 4 directions (E,W,S,N)
 Find the shortest path to reach the destination
 */

public class Shortest_path {

    public static float direction(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                y++;
            }

        }
        int X =x*x;
        int Y=y*y;
        return (float) Math.sqrt(X+Y);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.print(direction(path));
    }
}
