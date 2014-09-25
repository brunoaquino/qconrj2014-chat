package me.porcelli.chat.shared.event;

import me.porcelli.chat.shared.model.Message;
import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class BroadMessage {

    public Message message;

    public BroadMessage() {
    }

    public BroadMessage( Message message ) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
