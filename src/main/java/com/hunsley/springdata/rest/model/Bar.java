package com.hunsley.springdata.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Valid
@Entity
public class Bar implements Serializable {
    private static final long serialVersionUID = 1234567L;

    @Id
    private Long id;

    @Pattern(regexp = "^[a-zA-Z0-9]{1,25}$")
    private String name;

    @Pattern(regexp = "^[a-zA-Z0-9]{1,50}$")
    private String description;

    private LocalDateTime created;

    @ManyToOne
    private Foo foo;

}
