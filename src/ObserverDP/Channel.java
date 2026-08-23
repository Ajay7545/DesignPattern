package ObserverDP;

public interface Channel {

    void subscriber(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscriber();
}
