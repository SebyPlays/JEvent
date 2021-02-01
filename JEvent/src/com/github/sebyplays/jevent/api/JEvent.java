package com.github.sebyplays.jevent.api;

import com.github.sebyplays.jevent.*;
import com.github.sebyplays.jevent.util.AnnotationProcessor;
import lombok.Getter;
import lombok.Setter;

public class JEvent {

    @Getter @Setter private Event event;

    @Getter @Setter private boolean ignoringCancelled;

    public JEvent(Event event){
        this.setEvent(event);
    }

    public void callEvent(EventExecutor eventExecutor){
        new AnnotationProcessor().call(eventExecutor, this.event);
    }

}
