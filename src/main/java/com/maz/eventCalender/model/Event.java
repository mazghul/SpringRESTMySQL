package com.maz.eventCalender.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "startDate")
    private String startDate;
    @Column(name = "endDate")
    private String endDate;
    @Column(name = "toEmailId")
    private String toEmailId;
    @Column(name = "subject")
    private String subject;
    @Column(name = "attachment")
    private String attachment;

    public Event() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) { this.subject = subject; }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) { this.attachment = attachment; }
}
