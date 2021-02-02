# JEvent

## What is JEvent?
```
JEvent is a universal event api in which the usage of it, is very similar to the
usage of the Spigot-Event API.
It is meant to be super simple and unser-friendly.
```

## How do i use it?
```
1. To create a universal event, you have to extend/inherit the "Event" class.
2. Secondly, you have to create a class constructor with the information that should be
saved in the event.
3. once you are done creating your event class, you are theoreatically ready to create a listener.
4. to create a listener, you have to create a class, which implements the interface "Listener".
5. Within the new class you've just created, you have to create a method by any name and 
set its parameters to the wanted event.
6. now, you have to annotate the method with "@EventHandler".
7. to make the event event callable, you have to register it in a method that is being executed at the start of the program.
8. to call an event at any given point, you simply just write "new JEvent(new <EventClass>(<PARAMETERS>)).callEvent();"
9. now, if you have registered the listener class, the method in that class should be executed.
10. have fun :)
```

### Methods:
```java
you can register a listener with the following piece of code:
new JEvent(new <EventClass>()).registerEvent(new <ListenerClass>());
```
