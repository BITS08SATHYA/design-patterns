package structural.adapter_01.video;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Do Nothing");
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}
