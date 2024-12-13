package bridge;

public class UHD4kProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println("Processing UHD 4k video: " + videoFile);
    }
}
