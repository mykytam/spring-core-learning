import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // can access this class because of Spring Context dependency
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); // access applicationContext. xml file, read it and put Beans to Application Context

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        /*
        //Music music = context.getBean("musicBean", Music.class); // Bean id name & class, Bean of which we want to get
        //MusicPlayer musicPlayer = new MusicPlayer(music); // manual dependency injection

        // Spring dependency injection
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // getting musicPlayer from applicationContext & class, Bean of which we want to get
        MusicPlayer secondMusicPlayer  = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer; // pointer comparison
        System.out.println(comparison); // true, hash is equal. singleton works
        firstMusicPlayer.setVolume(10); // firstMusicPlayer's  and firstMusicPlayer's volume will be 10

        // What happens when adding DI with setter
        // MusicPlayer musicPlayer1 = new musicPlayer();  -  creating bean with empty constructor
        // musicPlayer1.setMusic();  -  using setter and transmitting bean

        //System.out.println(musicPlayer.getName()); // DI with setter done
        //System.out.println(musicPlayer.getVolume()); // DI with setter done
         */

        context.close(); // when finished working with Application Context, connection must be closed
    }
}
