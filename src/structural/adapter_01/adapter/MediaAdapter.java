package structural.adapter_01.adapter;

import structural.adapter_01.audio.MediaPlayer;
import structural.adapter_01.video.AdvancedMediaPlayer;
import structural.adapter_01.video.Mp4Player;
import structural.adapter_01.video.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
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
