package streaming;

public abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return String.format("Title: %s | Duration: %d min", title, duration);
    }
}
