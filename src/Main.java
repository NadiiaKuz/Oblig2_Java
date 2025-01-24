import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        TVSeries arcane = new TVSeries();

        arcane.setTitle("Arcane");
        arcane.setDescription("Arcane is an animated series about the origins of League of Legends");
        arcane.setReleaseDate(LocalDate.of(2021, 11, 6));

        /* Episode arcane1_1 = new Episode("Welcome to the Playground", 1, 1, 42);
        Episode arcane1_2 = new Episode("Some Mysteries Are Better Left Unsolved", 2, 1);
        Episode arcane1_3 = new Episode("The Base Violence Necessary for Change", 3, 1, 44);

        arcane.addEpisode(arcane1_1);
        arcane.addEpisode(arcane1_2);
        arcane.addEpisode(arcane1_3);

        System.out.println(arcane);
        System.out.println("---Episode 1---");
        System.out.println(arcane1_1);
        System.out.println("---Episode 2---");
        System.out.println(arcane1_2);
        System.out.println("---Episode 3---");
        System.out.println(arcane1_3); */

        for (int s = 1; s <= 5; s++){
            for(int e = 1; e <= 10; e++){
                Episode arcaneEpisode = new Episode("Episode" + e, e, s);
                arcane.addEpisode(arcaneEpisode);
            }
        }

        ArrayList<Episode> episodeInSeason = arcane.getEpisodesInSeason(4);

        for(Episode episode : episodeInSeason){
            System.out.println(episode.getTitle());
        }

    }
}
