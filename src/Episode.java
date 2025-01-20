public class Episode {
    private String title;
    private int episodeNumber;
    private int sesongNumber;
    private int rintime;

    public Episode(String title, int episodeNumber, int sesongNumber, int rintime) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.sesongNumber = sesongNumber;
        this.rintime = rintime;
    }

    public Episode(String title, int episodeNumber, int sesongNumber){
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.sesongNumber = sesongNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSesongNumber() {
        return sesongNumber;
    }

    public void setSesongNumber(int sesongNumber) {
        this.sesongNumber = sesongNumber;
    }

    public int getRintime() {
        return rintime;
    }

    public void setRintime(int rintime) {
        this.rintime = rintime;
    }
}
