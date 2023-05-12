package observation;

public class InterfaceMain {
    public static void main(String[] args) {
        Games game1 = new OutDoor("Shuttle");
        game1.playGame();

        Games game2 = new InDoor("UNO");
        game2.playGame();
    }
}

interface Games {
    void playGame();
    String showGame();
}

class OutDoor implements Games {
    private String name;

    public OutDoor(String n){
        name = n;
    }

    public void playGame(){
        System.out.println("Playing OutDoor Game: " + showGame());
    }

    public String showGame(){
        return name;
    }
}

class InDoor implements Games {
    private String name;

    public InDoor(String n){
        name = n;
    }

    public void playGame(){
        System.out.println("Playing InDoor Game: " + showGame());
    }

    public String showGame(){
        return name;
    }
}
