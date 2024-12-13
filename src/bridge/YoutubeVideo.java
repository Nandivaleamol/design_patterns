package bridge;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessor processor) {
        super(processor);
    }
    @Override
    public void play(String videoFile) {
        processor.process(videoFile); // Processed as per given processor
        System.out.println("Playing YouTube video: " + videoFile);
    }
}
