package org.example.behavioral;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<EmailSubscriptions> subscribers;

    public NotificationService(){
        subscribers = new ArrayList<>();
    }

    public void subscribe(EmailSubscriptions subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(EmailSubscriptions subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(){
        subscribers.forEach(subscriber -> subscriber.update());
    }

}
