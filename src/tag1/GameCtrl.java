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
        
        
        
        /*noter til Jakob:
        jeg tænker at vi i Rooms skal tilføje et par booleans mere, en til loot og en til fare, og så skal rummet kalde
        de to ting hvis de bliver triggered (f.eks hvis der er loot skal man kunne søge rummet) hvis faren så er loot
        skal den naturligvis først kaldes hvis spilleren looter (f.eks den rådne mad)
        Da det er rooms er det dig der skal implementere det for at vi ikke ødelægger det hele
        
        derudover har jeg lavet en movement i player men jeg er usikker på om den er kommet med, send gerne lige info via
        facebook om det er i den version du har fået.
        */
    }
    
}
