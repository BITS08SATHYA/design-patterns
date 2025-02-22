package structural.adapter_01.example_1.app;

import structural.adapter_01.example_1.adapter.AudioMediaAdapter;
import structural.adapter_01.example_1.MediaPlayer.MediaPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        MediaPlayer player = new AudioMediaAdapter();

        player.play("mp3", "song.mp3"); // audio file format
        player.play("mp4", "video.mp4"); // video file format-1
        player.play("vlc", "movie.vlc"); // video file format-2
        player.play("avi", "documentary.avi"); // unknown format

    }
}
