package structural.adapter_01.audio;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("pLaying MP3 file: " + fileName);
        }else{
            System.out.println("Invalid media format: " + audioType);
        }
    }
}
