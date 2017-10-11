package tag1;


public class GameCtrl {
    
    public void GameCtrl() {
        
        Player p1 = new Player();
        Rooms r1 = new Rooms();
        p1.Player();
        r1.Rooms();
        //r1.room.get(0); flyt ArrayList room ud af metoden (op under boolean roomInteraction)
        r1.description(); //r1.description("Start"); muliggør dette
        p1.Movement();
        
        
        
        
        
    }
    
}
