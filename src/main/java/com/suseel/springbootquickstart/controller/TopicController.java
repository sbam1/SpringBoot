package com.suseel.springbootquickstart.controller;

import com.suseel.springbootquickstart.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic(1, "spring mvc", "this is a spring mvc tutorial"));
        return topics;
    }
}
