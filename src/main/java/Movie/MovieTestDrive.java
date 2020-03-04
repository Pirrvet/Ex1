package Movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie M_one=new Movie();
        M_one.title="Как прогореть на акциях";
        M_one.genre="Трагедия";
        M_one.rating=-2;
        Movie M_two=new Movie();
        M_two.title="Потерянные в офисе";
        M_two.genre="Комедия";
        M_two.rating=5;
        M_two.playIt();
        Movie M_three=new Movie();
        M_three.title="Байт-Клуб";
        M_three.genre="Трагедия, но в целом весёлая";
        M_three.rating=127;
    }
}
