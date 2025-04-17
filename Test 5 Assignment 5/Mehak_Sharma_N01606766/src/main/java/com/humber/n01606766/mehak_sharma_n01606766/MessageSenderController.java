package com.humber.n01606766.mehak_sharma_n01606766;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class MessageSenderController {
    private final JmsTemplate jmsTemplate;

    public MessageSenderController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("demo-queue", message);
        return "Message sent: " + message;
    }

    @PostMapping("/send")
    public String sendStructuredMessage(@RequestBody MessageParser parser) {
        jmsTemplate.convertAndSend("lab-queue", parser);
        return "Structured message sent: " + parser.getMessage();
    }
}
