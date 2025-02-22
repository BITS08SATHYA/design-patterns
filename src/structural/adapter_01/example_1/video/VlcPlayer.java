package structural.adapter_01.example_1.video;

import structural.adapter_01.example_1.MediaPlayer.AdvancedMediaPlayer;

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
