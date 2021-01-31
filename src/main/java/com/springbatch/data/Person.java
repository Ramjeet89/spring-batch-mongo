package com.springbatch.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Setter
@Getter
@ToString

@Document("Person")
public class Person {
    @Id
    private int customerId;
    private String name;
    private String email;
    private String contactNumber;
    private Date dob;
    private String status;
    private double outstandingAmount;
    private Date lastDueDate;
}
