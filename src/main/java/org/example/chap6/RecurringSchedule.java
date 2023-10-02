package org.example.chap6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class RecurringSchedule {
    private String subject;
    private DayOfWeek dayOfWeek;
    private LocalTime from;
    private Duration duration;

    public RecurringSchedule(final String subject, final DayOfWeek dayOfWeek, final LocalTime from, final Duration duration) {
        this.subject = subject;
        this.dayOfWeek = dayOfWeek;
        this.from = from;
        this.duration = duration;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getFrom() {
        return from;
    }

    public Duration getDuration() {
        return duration;
    }
}
