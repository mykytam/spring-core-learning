package musicplayer;

public class MusicPlayer {
    private Music music; // common interface musicplayer.Music

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
