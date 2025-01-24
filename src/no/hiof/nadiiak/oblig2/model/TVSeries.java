package no.hiof.nadiiak.oblig2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;
    private double averageRunTime;
    private int numSeasons;

    public TVSeries(){
        episodes = new ArrayList<>();
        numSeasons = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }

    public double getAverageRunTime() {
        return averageRunTime;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public void addEpisode(Episode episode){
        int episodesSeason = episode.getSeasonNumber();

        if (episodesSeason > numSeasons + 1){
            System.out.println("ERROR: Episode: " + episode.getTitle() + " could not be added in " +
                    episodesSeason + " season. The allowed season is " + (numSeasons + 1));
            return;
        }

        if (episodesSeason == numSeasons + 1) {
            numSeasons++;
        }

        episodes.add(episode);
        averageRunTime = updateAverageRuntime();
    }

    @Override
    public String toString() {
        return "TV series Title: " + title + '\n' +
                "Description: " + description + '\n' +
                "Release date: " + releaseDate + '\n' +
                "Number of episodes: " + episodes.size() + '\n';
    }

    public ArrayList<Episode> getEpisodesInSeason(int season){

        ArrayList<Episode> episodesInSeason = new ArrayList<>();

        if (episodes.isEmpty()) {
            System.out.println("There are no episodes in season " + season);
        }

        for (Episode episode : episodes){
            if(episode.getSeasonNumber() == season){
                episodesInSeason.add(episode);
            }
        }

        return episodesInSeason;
    }

    private double updateAverageRuntime(){
        int runtimeSum = 0;
        int numberOfEpisodes = episodes.size();

        if (numberOfEpisodes == 0){
            return 0;
        }

        for (Episode episode : episodes){
            runtimeSum += episode.getRuntime();
        }

        double result = (double) runtimeSum / numberOfEpisodes;
        return Math.round(result * 10.0) / 10.0;
    }
}

