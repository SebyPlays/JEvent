package com.github.sebyplays.jevent;

import lombok.Getter;
import lombok.Setter;

public class RegisteredListener {

    @Getter @Setter private Listener listener;
    @Getter @Setter private Event event;

    public RegisteredListener(Listener listener, Event event){
        this.setListener(listener);
        this.setEvent(event);

    }

    public void callEvent(){
        new EventExecutor().execute(this.getListener(), this.getEvent());
    }

}
