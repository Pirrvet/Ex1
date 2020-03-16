package Page66_B;

public class DVDplayerTestDrive {
    public static void main(String[] args) {
        DVDplayer d =new DVDplayer();
        d.canrecord=true;
        d.playDVD();
        if (d.canrecord==true)
        {
            d.recordDVD();
        }
    }
}
