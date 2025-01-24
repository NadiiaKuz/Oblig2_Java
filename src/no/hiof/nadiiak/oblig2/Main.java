package no.hiof.nadiiak.oblig2;

import no.hiof.nadiiak.oblig2.model.Episode;
import no.hiof.nadiiak.oblig2.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args){

        TVSeries arcane = new TVSeries();

        arcane.setTitle("Arcane");
        arcane.setDescription("Arcane is an animated series about the origins of League of Legends");
        arcane.setReleaseDate(LocalDate.of(2021, 11, 6));

        Episode arcane1_1 = new Episode("Welcome to the Playground", 1, 1, 42);
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
        System.out.println(arcane1_3);

        Random random = new Random();

        for (int s = 1; s <= 5; s++){
            for(int e = 1; e <= 10; e++){
                int rand = random.nextInt(20, 30);

                Episode arcaneEpisode = new Episode("Episode" + e, e, s, rand);
                arcane.addEpisode(arcaneEpisode);
            }
        }

        ArrayList<Episode> episodeInSeason = arcane.getEpisodesInSeason(4);

        System.out.println("--------------------");
        System.out.println("Season 4:");
        for(Episode episode : episodeInSeason){
            System.out.println(episode.getTitle());
        }

        System.out.println("--------------------");
        System.out.println("The average run time of " + arcane.getTitle() + " TV series is " + arcane.getAverageRunTime() + " minutes");

        System.out.println("--------------------");
        Episode testEpisode1 = new Episode("Episode test1", 11, 5, 35);
        arcane.addEpisode(testEpisode1);

        System.out.println("TV series " + arcane.getTitle() + " have " + arcane.getNumSeasons() + " seasons");

        System.out.println("--------------------");
        Episode testEpisode2 = new Episode("Episode test2", 1, 6, 35);
        arcane.addEpisode(testEpisode2);

        System.out.println("TV series " + arcane.getTitle() + " have " + arcane.getNumSeasons() + " seasons");

        System.out.println("--------------------");
        Episode testEpisode3 = new Episode("Episode test3", 1, 8, 35);
        arcane.addEpisode(testEpisode3);

        System.out.println("--------------------");
        System.out.println("TV series " + arcane.getTitle() + " have " + arcane.getNumSeasons() + " seasons");
    }
}
