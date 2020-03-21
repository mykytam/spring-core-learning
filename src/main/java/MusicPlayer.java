
public class MusicPlayer {

    private Music music; // common interface Music
    private String name;
    private int volume;

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() { }

    // DI through setter
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
