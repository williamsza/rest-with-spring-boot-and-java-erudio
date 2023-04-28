package br.com.williamsouza.restapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final String Template = " Hello, %s!";
    private final AtomicLong counter = new AtomicLong(0);


    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(Template, name));
    }

}
