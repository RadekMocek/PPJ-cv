package app.assignments.app;

import app.assignments.configurations.ReplyMessageConfig;
import app.assignments.configurations.WriterConfig;
import app.assignments.message.CustomMessage;
import app.assignments.message.Message;
import app.assignments.message.PingMessage;
import app.assignments.message.ReplyMessage;
import app.assignments.writer.ListWriter;
import app.assignments.writer.StdoutWriter;
import app.assignments.writer.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ReplyMessageConfig.class, WriterConfig.class})
//@ComponentScan("app.assignments")
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Message ping = context.getBean(PingMessage.class);
        Message hello = context.getBean(CustomMessage.class);
        Message pingReply = context.getBean(ReplyMessage.class);

        Writer stdoutWriter = context.getBean(StdoutWriter.class);
        ListWriter listWriter = context.getBean(ListWriter.class);
        stdoutWriter.write(ping);
        stdoutWriter.write(hello);
        stdoutWriter.write(pingReply);

        listWriter.write(ping);
        listWriter.listWrittenMessages().forEach(stdoutWriter::write);

        Message ping2 = context.getBean(PingMessage.class);
        stdoutWriter.write(ping2);
    }

}
