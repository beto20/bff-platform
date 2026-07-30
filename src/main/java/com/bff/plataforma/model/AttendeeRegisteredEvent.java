package com.bff.plataforma.model;

import java.time.Instant;
import java.util.UUID;

public record AttendeeRegisteredEvent(
        UUID eventId,
        String eventType,
        int schemaVersion,
        String attendeeId,
        String email,
        Instant occurredAt
) {

    public static AttendeeRegisteredEvent create(
            String attendeeId,
            String email
    ) {
        return new AttendeeRegisteredEvent(
                UUID.randomUUID(),
                "attendee.registered",
                1,
                attendeeId,
                email,
                Instant.now()
        );
    }
}