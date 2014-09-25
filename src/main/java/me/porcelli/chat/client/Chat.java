package me.porcelli.chat.client;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.RootPanel;
import org.jboss.errai.ioc.client.api.EntryPoint;

@EntryPoint
public class Chat {

    @Inject
    private ChatLog log;

    @Inject
    private ChatForm form;

    @PostConstruct
    public void init() {
        RootPanel.get().add( log );
        RootPanel.get().add( form );
    }
}
