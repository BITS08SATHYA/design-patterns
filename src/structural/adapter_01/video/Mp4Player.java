package structural.adapter_01.video;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
//        System.out.println();
    }
}
