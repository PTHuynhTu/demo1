package com.citynow.smallerp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Entity
@Table(name = "leave_form")
public class LeaveForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "from_date")
    private Date fromDate;

    @NotBlank
    @Column(name = "to_date")
    private Date toDate;

    @NotBlank
    @Size(max = 255)
    private String reason;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_id;
//    @OneToOne(mappedBy = "LeaveModel")
//    private User user;

    public LeaveForm(Long id, Date fromDate, Date toDate, String reason, User user_id){
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
        this.user_id = user_id;
    }

    public  LeaveForm(){

    }
}
