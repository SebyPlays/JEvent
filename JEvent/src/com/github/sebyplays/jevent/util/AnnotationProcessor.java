package com.github.sebyplays.jevent.util;


import com.github.sebyplays.jevent.Event;
import com.github.sebyplays.jevent.EventExecutor;
import com.github.sebyplays.jevent.EventHandler;
import com.github.sebyplays.jevent.Listener;
import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public AnnotationProcessor(){

    }

    @SneakyThrows
    public void call(Listener listener, Event event){
        Class c = listener.getClass();
        for(Method method : c.getMethods()){
            if(method.isAnnotationPresent(EventHandler.class)){
                Object object = c.newInstance();
                method.invoke(object, event);
            }
        }
    }
}
