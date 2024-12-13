package abstractfactory.cloudprovider;

public interface CloudStorage {
    void upload(String fileName);
    void download(String fileName);
}
