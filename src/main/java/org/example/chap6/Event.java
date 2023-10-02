package org.example.chap6;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(final String subject, final LocalDateTime from, final Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(RecurringSchedule schedule) {
        if (from.getDayOfWeek() != schedule.getDayOfWeek() ||
                !from.toLocalTime().equals(schedule.getFrom()) ||
                !duration.equals(schedule.getDuration())) {
            reshedule(schedule);
            return false;
        }
        return true;
    }

    private void reshedule(RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(schedule)), schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long daysDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }

}
