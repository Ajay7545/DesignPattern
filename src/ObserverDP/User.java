package ObserverDP;

public class User implements Subscriber{

    private String name;
    private YoutubeChannel youtubeChannel;

    public User(String name, YoutubeChannel youtubeChannel) {
        this.name = name;
        this.youtubeChannel = youtubeChannel;
    }

    @Override
    public void update() {
        System.out.println("Hi "+name +" latest video : "+youtubeChannel);

    }
}
