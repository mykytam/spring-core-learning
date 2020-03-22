package musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // can access this class because of Spring Context dependency
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); // access applicationContext. xml file, read it and put Beans to Application Context

        Music music1 = context.getBean("rockMusic", Music.class); // Bean id (name of class) & class, Bean of which we want to get
        MusicPlayer rockPlayer = new MusicPlayer(music1); // manual dependency injection
        rockPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class); // Bean id (name of class) & class, Bean of which we want to get
        MusicPlayer classicalPlayer = new MusicPlayer(music2); // manual dependency injection
        classicalPlayer.playMusic();

        context.close(); // when finished working with Application Context, connection must be closed
        
    }

}
