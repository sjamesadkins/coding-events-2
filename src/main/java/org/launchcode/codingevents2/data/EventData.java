package org.launchcode.codingevents2.data;

import org.launchcode.codingevents2.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // store event data in a constant location
    private static final Map<Integer, Event> events = new HashMap<>();

    // return all events
    public static Collection<Event> getAll() {
        return events.values();
    }

    // return one event
    public static Event getById(int id) {
        return events.get(id);
    }

    // add event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    public static void remove(int id) {
        events.remove(id);
    }

}
