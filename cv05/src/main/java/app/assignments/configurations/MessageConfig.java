package app.assignments.configurations;

import app.assignments.message.CustomMessage;
import app.assignments.message.PingMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MessageConfig {

    @Bean
    @Scope("prototype")
    public PingMessage pingMessage() {
        return new PingMessage();
    }

    @Bean
    public CustomMessage customMessage() {
        return new CustomMessage("Sender", "Recipient", "Hello there!");
    }

}
