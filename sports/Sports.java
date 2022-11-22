package sports;

abstract class OutdoorGame{

    void type() {
        System.out.println("OutDoorGames");
    }

    abstract void play();

}

class Football extends OutdoorGame{

    void play(){
        System.out.println("Play Football");
    }

}

class Circket extends OutdoorGame{
    @Override
    void play() {
        System.out.println("Play Cricket");
    }
}

public class Sports {
    public static void main(String[] args) {
        Football f1 = new Football();
        f1.type();
        f1.play();

        Circket c1 = new Circket();
        c1.type();
        c1.play();

    }
}
