package LiskovSubstitutionPrinciple.After;

public class Ipod implements MusicPlayer{
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing "+fileName+" music in Ipod.");
    }
}
