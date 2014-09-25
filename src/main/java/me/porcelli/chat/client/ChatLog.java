package me.porcelli.chat.client;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import me.porcelli.chat.shared.event.BroadMessage;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

@Templated
public class ChatLog extends Composite {

    @Inject
    @DataField
    TextArea myChatLog;

    public void onMessages( @Observes final BroadMessage newMessage ) {
        final StringBuilder sb = new StringBuilder();
        sb.append( "[" );
        sb.append( newMessage.getMessage().getDate() );
        sb.append( "] " );
        sb.append( newMessage.getMessage().getFrom() );
        sb.append( ": " );
        sb.append( newMessage.getMessage().getContent() );

        myChatLog.setReadOnly( true );
        myChatLog.setText( myChatLog.getText() + "\n" + sb.toString() );
    }

}
