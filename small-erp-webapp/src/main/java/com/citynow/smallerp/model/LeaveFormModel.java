package com.citynow.smallerp.model;

import com.citynow.smallerp.entity.User;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class LeaveFormModel {
    private Long id;
    private Date fromDate;
    private Date toDate;
    private String reason;
    private User user_id;
    private Set<LeaveFormModel> leaveFormModels = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Set<LeaveFormModel> getLeaveFormModels() {
        return leaveFormModels;
    }

    public void setLeaveFormModels(Set<LeaveFormModel> leaveFormModels) {
        this.leaveFormModels = leaveFormModels;
    }
}
