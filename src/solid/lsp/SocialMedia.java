package solid.lsp;

// Liskov Substitution Principle (LSP) violation
public abstract class SocialMedia {

    // Support WhatsApp, Facebook, Instagram
    abstract void chatWithFriend();

    // Support Facebook, Instagram
    abstract void publishPost(Object post);

    // Support WhatsApp, Facebook, Instagram
    abstract void sendPhotoAndVideos();

    // Support WhatsApp, Facebook
    abstract void groupVideoCall(String... users);
}
