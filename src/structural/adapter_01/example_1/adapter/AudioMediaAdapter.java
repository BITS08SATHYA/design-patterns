package structural.adapter_01.example_1.adapter;

import structural.adapter_01.example_1.MediaPlayer.MediaPlayer;

public class AudioMediaAdapter implements MediaPlayer {

    VideoMediaAdapter videoMediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file: " + fileName);
        }else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
            videoMediaAdapter = new VideoMediaAdapter(audioType);
            videoMediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid Media Format: " + audioType);
        }
    }
}
