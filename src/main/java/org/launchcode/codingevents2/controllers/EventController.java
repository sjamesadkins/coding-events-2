package org.launchcode.codingevents2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at events/create
    @GetMapping("create")
    public String renderEventCreateForm() {
        return "events/create";
    }

    // lives at events/create too
    @PostMapping("create")
    public String createEvent(String eventName) {
        events.add(eventName);
        return "redirect:";
    }


}
