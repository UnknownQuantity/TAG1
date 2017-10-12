
package tag1;

import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;
//..
public class TAG1 {

    public static void main(String[] args) {
        TextIO io = new TextIO(new SysTextIO());
        Rooms r1 = new Rooms();
        Player p1 = new Player();
        List choices = Arrays.asList(new String[]{"A", "B", "C"});
        int p = io.select("header", choices, "footer");
        System.out.println(p);
        GameCtrl game = new GameCtrl();
        game.GameCtrl();
    }
    
}
