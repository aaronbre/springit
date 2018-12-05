package com.fracasapps.springit.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Comment extends Auditable{
    @Id
    @GeneratedValue
    private long id;
    private String body;

    @ManyToOne
    private Link link;

}
