import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;

    public TVSeries(){
        episodes = new ArrayList<>();
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

    public void addEpisode(Episode episode){
        episodes.add(episode);
    }

    @Override
    public String toString() {
        return "TV series Title: " + title + '\n' +
                "Description: " + description + '\n' +
                "Release date: " + releaseDate + '\n' +
                "Number of episodes: " + episodes.size() + '\n';
    }

    public ArrayList<Episode> getEpisodesInSeason(int season){
        System.out.println("Season " + season);

        ArrayList<Episode> episodesInSeason = new ArrayList<>();

        for (Episode episode : episodes){
            if(episode.getSeasonNumber() == season){
                episodesInSeason.add(episode);
            }
        }

        return episodesInSeason;
    }
}
