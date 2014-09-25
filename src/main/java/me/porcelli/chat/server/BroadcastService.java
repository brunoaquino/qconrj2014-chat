package me.porcelli.chat.server;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import me.porcelli.chat.shared.event.BroadMessage;
import me.porcelli.chat.shared.event.NewMessage;

@ApplicationScoped
public class BroadcastService {

    @Inject
    private Event<BroadMessage> messageEvent;

    public void onNewMessage( @Observes final NewMessage event ) {
        messageEvent.fire( new BroadMessage( event.getMessage() ) );
    }

}
