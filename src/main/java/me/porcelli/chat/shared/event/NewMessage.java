package me.porcelli.chat.shared.event;

import me.porcelli.chat.shared.model.Message;
import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class NewMessage {

    public Message message;

    public NewMessage() {
    }

    public NewMessage( Message message ) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
