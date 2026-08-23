package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;

    @Override
    public String toString() {
        return "YoutubeChannel{" +
                "subscribers=" + subscribers +
                ", latestVideo='" + latestVideo + '\'' +
                '}';
    }

    @Override
    public void subscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {
        for (var s : subscribers) {
            s.update();
        }

    }
    public void uploadVideo(String title){
        this.latestVideo=title;
        System.out.println("Video Uploaded");
        notifySubscriber();

    }

    public String getLatestVideo() {
        return latestVideo;
    }
}
