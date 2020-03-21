import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // can access this class because of Spring Context dependency
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); // access applicationContext. xml file, read it and put Beans to Application Context

        //Music music = context.getBean("musicBean", Music.class); // Bean id name & class, Bean of which we want to get
        //MusicPlayer musicPlayer = new MusicPlayer(music); // manual dependency injection

        // Spring dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // getting musicPlayer from applicationContext & class, Bean of which we want to get
        musicPlayer.playMusic();

        // What happens when adding DI with setter
        // MusicPlayer musicPlayer1 = new musicPlayer();  -  creating bean with empty constructor
        // musicPlayer1.setMusic();  -  using setter and transmitting bean

        System.out.println(musicPlayer.getName()); // DI with setter done
        System.out.println(musicPlayer.getVolume()); // DI with setter done

        context.close(); // when finished working with Application Context, connection must be closed
    }
}
