package com.github.sebyplays.jevent.api;

import com.github.sebyplays.jevent.*;
import lombok.Getter;
import lombok.Setter;

public class JEvent {

    @Getter @Setter private Event event;

    public JEvent(Event event){
        this.setEvent(event);
    }

    public JEvent callEvent(){
        for(RegisteredListener registeredListener : HandlerList.handlers){
            if(registeredListener.getEvent().getClass() == this.getEvent().getClass()){
                registeredListener.setEvent(this.getEvent());
                registeredListener.callEvent();
            }
        }
        return this;
    }

    public void registerListener(Listener listener){
        HandlerList.handlers.add(new RegisteredListener(listener, this.getEvent()));
    }

    public void unregisterListener(Listener listener){
        HandlerList.handlers.remove(new RegisteredListener(listener, this.getEvent()));
    }
}
