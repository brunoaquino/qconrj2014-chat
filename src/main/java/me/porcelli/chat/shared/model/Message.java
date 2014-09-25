package me.porcelli.chat.shared.model;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;

@Portable
@Bindable
public class Message {

    private String from;
    private String content;
    private String date;

    public String getFrom() {
        return from;
    }

    public void setFrom( String from ) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent( String content ) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate( String date ) {
        this.date = date;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof Message ) ) {
            return false;
        }

        Message message = (Message) o;

        if ( content != null ? !content.equals( message.content ) : message.content != null ) {
            return false;
        }
        if ( date != null ? !date.equals( message.date ) : message.date != null ) {
            return false;
        }
        if ( from != null ? !from.equals( message.from ) : message.from != null ) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + ( content != null ? content.hashCode() : 0 );
        result = 31 * result + ( date != null ? date.hashCode() : 0 );
        return result;
    }
}
