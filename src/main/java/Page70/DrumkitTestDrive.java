package Page70;

public class DrumkitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.snare=false;
        d.playsnare();
        if (d.snare == true)
        {
            d.playsnare();
        }
        d.playTopHat();

    }
}
