package com.github.sebyplays.jevent;

import lombok.Getter;
import lombok.Setter;

public class Event implements Cancellable {

    @Getter private boolean cancelled;
    @Getter private String eventName = getClass().getSimpleName();

    @Override
    public void setCancelled(boolean isCancelled) {
        this.cancelled = isCancelled;
    }
}
