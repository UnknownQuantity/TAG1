package tag1;


public class GameCtrl {
    
    public void GameCtrl() {
        boolean d = true;
        while(d == true) {
        Player p1 = new Player();
        Rooms r1 = new Rooms();
        
        p1.Player();
        r1.Rooms();
        r1.room.get(0);
        r1.description();
        p1.Movement();
        r1.room.get(1);
        r1.description();
        p1.Movement();
        p1.Health("Death");
        d = false;
        }
    }
    
}
