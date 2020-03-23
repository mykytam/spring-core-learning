package musicplayer.config;

import musicplayer.Music;
import musicplayer.genres.ClassicalMusic;
import musicplayer.Computer;
import musicplayer.MusicPlayer;
import musicplayer.genres.JazzMusic;
import musicplayer.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration // configuration class
// @ComponentScan("musicplayer") - scanning for components in package and automatically creating beans
@PropertySource("musicPlayer.properties") // DI from external file
public class SpringConfig {
    // making beans by writing java code
    @Bean
    public ClassicalMusic classicalMusic() { return new ClassicalMusic();}

    @Bean
    public RockMusic rockMusic() { return new RockMusic();}

    @Bean
    public JazzMusic jazzMusic() {return new JazzMusic();}

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
