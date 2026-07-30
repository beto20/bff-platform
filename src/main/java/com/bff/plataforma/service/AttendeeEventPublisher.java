package com.bff.plataforma.service;

import com.bff.plataforma.model.AttendeeRegisteredEvent;
import io.awspring.cloud.sqs.operations.SendResult;
import io.awspring.cloud.sqs.operations.SqsOperations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AttendeeEventPublisher {

    private final SqsOperations sqsOperations;
    private final String queueUrl;

    public AttendeeEventPublisher(
            SqsOperations sqsOperations,
            @Value("${app.sqs.attendee-events-url}") String queueUrl
    ) {
        this.sqsOperations = sqsOperations;
        this.queueUrl = queueUrl;
    }

    public UUID publish(AttendeeRegisteredEvent event) {
        SendResult<AttendeeRegisteredEvent> result =
                sqsOperations.send(options -> options
                        .queue(queueUrl)
                        .payload(event)
                        .messageGroupId(event.attendeeId())
                        .messageDeduplicationId(event.eventId().toString())
                        .header("eventType", event.eventType())
                        .header("schemaVersion", event.schemaVersion())
                );

        return result.messageId();
    }
}