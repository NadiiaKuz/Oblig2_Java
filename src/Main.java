import java.time.LocalDate;

public class Main {
    public static void main (String[] args){

        TVSeries arcane = new TVSeries();

        arcane.setTitle("Arcane");
        arcane.setDescription("Arcane is an animated series about the origins of League of Legends");
        arcane.setReleaseDate(LocalDate.of(2021, 11, 6));

        Episode arcaneEpisode1 = new Episode("Arcane", 1, 1, 42);

        arcane.addEpisode(arcaneEpisode1);
    }
}
