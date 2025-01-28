package org.example.behavioral;

public class Store {

    private final NotificationService  notificationService;

    public Store(){
        notificationService = new NotificationService();
    }

    public static void main(String[] args) {
        EmailSubscriptions luis = new EmailSubscriptions("luis@gft.com","Luis");

        Store store = new Store();
        store.getService().subscribe(new EmailSubscriptions("daniel@gft.com","Daniel"));
        store.getService().subscribe(new EmailSubscriptions("maria@gft.com","Maria"));
        store.getService().subscribe(luis);

        store.reStock();

        store.getService().unsubscribe(luis);
        store.getService().subscribe(new MobileSubscriptions("Luis"));

        System.out.println("\nUpdated subscription list\n");

        store.reStock();

    }

    public NotificationService getService(){
        return notificationService;
    }

    public void reStock(){
        notificationService.notifySubscriber();
    }

}
