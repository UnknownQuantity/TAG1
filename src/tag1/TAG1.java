
package tag1;

import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;

public class TAG1 {

    public static void main(String[] args) {
        TextIO io = new TextIO(new SysTextIO());
        
        List choices = Arrays.asList(new String[]{"A", "B", "C"});
        int p = io.select("header", choices, "footer");
        System.out.println(p);
    }
    
}