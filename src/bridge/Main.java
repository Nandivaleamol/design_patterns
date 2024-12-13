package bridge;

public class Main {
    public static void main(String[] args) {
        YoutubeVideo youtubeVideo = new YoutubeVideo(new HDProcessor());
        youtubeVideo.play("abc.mp4");

        NetflixVideo netflixVideo = new NetflixVideo(new UHD4kProcessor());
        netflixVideo.play("def.mp4");
    }
}
