package app.assignments.configurations;

import app.assignments.message.CustomMessage;
import app.assignments.message.PingMessage;
import app.assignments.message.ReplyMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public PingMessage pingMessage() {
        return new PingMessage();
    }

    @Bean
    public CustomMessage customMessage() {
        return new CustomMessage("Sender", "Recipient", "Hello there!");
    }

    @Bean
    public ReplyMessage replyMessage() {
        return new ReplyMessage(pingMessage(), "Pong!");
    }

}
