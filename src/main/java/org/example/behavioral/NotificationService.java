package org.example.behavioral;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<SubscriptionChannel> subscribers;

    public NotificationService(){
        subscribers = new ArrayList<>();
    }

    public void subscribe(SubscriptionChannel subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(SubscriptionChannel subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(){
        subscribers.forEach(subscriber -> subscriber.update());
    }

}
