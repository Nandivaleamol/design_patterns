package solid.lsp;

// LSP: Liskov Substitution Principle
public class Instagram extends SocialMedia{
    @Override
    void chatWithFriend() {

    }

    @Override
    void publishPost(Object post) {

    }

    @Override
    void sendPhotoAndVideos() {

    }

    @Override
    void groupVideoCall(String... users) {
        // Not application to instagram
    }
}
