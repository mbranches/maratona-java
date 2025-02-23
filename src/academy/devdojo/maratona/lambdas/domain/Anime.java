package academy.devdojo.maratona.lambdas.domain;

public class Anime {
    private String title;
    private Integer Episodes;

    public Anime(String title, int episodes) {
        this.title = title;
        this.Episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", Episodes=" + Episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return Episodes;
    }
}
