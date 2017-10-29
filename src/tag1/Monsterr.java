package tag1;

public class Monsterr extends GameCtrl implements Monster {

    @Override
    public void movement() {
        int ran = (int) ((Math.random() * 4) + 1);
        switch (ran) {
            case 1:
                rooms.get(1);
                break;
            case 2:
                rooms.get(2);
                break;
            case 3:
                rooms.get(3);
                break;
            case 4:
                rooms.get(4);
                break;
            default:
                break;
        }
    }

    @Override
    public void kill() {
        game.player.health("Monster");
    }

    @Override
    public void startPos() {
        rooms.get(18);
    }

}
