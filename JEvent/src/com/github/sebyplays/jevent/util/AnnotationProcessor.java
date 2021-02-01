package com.github.sebyplays.jevent.util;

import com.github.sebyplays.jevent.Event;
import com.github.sebyplays.jevent.EventExecutor;
import com.github.sebyplays.jevent.EventHandler;
import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public AnnotationProcessor(){

    }

    @SneakyThrows
    public void call(EventExecutor eventExecutor, Event event){
        Class c = eventExecutor.getClass();
        for(Method method : c.getMethods()){
            if(method.isAnnotationPresent(EventHandler.class)){
                Object object = c.newInstance();
                method.invoke(object, event);
            }
        }
    }
}
