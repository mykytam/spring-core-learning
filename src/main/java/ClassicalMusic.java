public class ClassicalMusic implements Music {

    private ClassicalMusic() {} // no class objects creation

    public static  ClassicalMusic getClassicalMusic() { // fabric method
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
