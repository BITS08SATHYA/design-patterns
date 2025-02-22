package structural.adapter_01.example_1.video;

import structural.adapter_01.example_1.MediaPlayer.AdvancedMediaPlayer;

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
