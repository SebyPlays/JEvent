package com.github.sebyplays.jevent;

import com.github.sebyplays.jevent.util.AnnotationProcessor;

public class EventExecutor {
    public void execute(Listener listener, Event event){
        new AnnotationProcessor().call(listener, event);
    }
}
