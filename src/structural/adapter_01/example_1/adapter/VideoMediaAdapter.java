package structural.adapter_01.example_1.adapter;

import structural.adapter_01.example_1.MediaPlayer.MediaPlayer;
import structural.adapter_01.example_1.MediaPlayer.AdvancedMediaPlayer;
import structural.adapter_01.example_1.video.Mp4Player;
import structural.adapter_01.example_1.video.VlcPlayer;

/**
 * Adapter is designed for running only video files
 * */
public class VideoMediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public VideoMediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
