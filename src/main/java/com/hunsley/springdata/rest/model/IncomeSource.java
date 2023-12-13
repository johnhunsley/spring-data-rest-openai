package com.hunsley.springdata.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class IncomeSource implements Serializable {
    private static final long serialVersionUID = 1234567L;

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private int type;
}
