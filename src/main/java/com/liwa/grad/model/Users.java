package com.liwa.grad.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "users")
public class Users {
    @Id
    private String id;

    private String name;

    private String email;

    private Date signup_date;
}
