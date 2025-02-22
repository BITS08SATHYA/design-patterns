package structural.adapter_01.app;

import structural.adapter_01.adapter.AudioPlayerWithAdapter;
import structural.adapter_01.audio.MediaPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        MediaPlayer player = new AudioPlayerWithAdapter();

        player.play("mp3", "song.mp3"); // audio file format
        player.play("mp4", "video.mp4"); // video file format-1
        player.play("vlc", "movie.vlc"); // video file format-2
        player.play("avi", "documentary.avi"); // unknown format

    }
}
