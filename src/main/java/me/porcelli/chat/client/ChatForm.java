package me.porcelli.chat.client;

import java.util.Date;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import me.porcelli.chat.shared.event.NewMessage;
import me.porcelli.chat.shared.model.Message;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Model;
import org.jboss.errai.ui.shared.api.annotations.Templated;

@Templated
public class ChatForm extends Composite {

    @Inject
    private Event<NewMessage> newMessageEvent;

    @Inject
    @Model
    Message message;

    @Inject
    @Bound
    @DataField
    TextBox from;

    @Inject
    @Bound
    @DataField
    TextBox content;

    @Inject
    @DataField
    Button sendButton;

    @EventHandler("sendButton")
    public void onSend( final ClickEvent event ) {
        message.setDate( new Date().toString() );
        newMessageEvent.fire( new NewMessage( message ) );
    }
}
