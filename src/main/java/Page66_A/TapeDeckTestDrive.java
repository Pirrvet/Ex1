package Page66_A;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck td= new TapeDeck();
        td.canRecord = true;
        td.playTape();
        if (td.canRecord == true)
        {
            td.recordTape();
        }
    }
}
