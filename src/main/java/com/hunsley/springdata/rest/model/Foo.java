package com.hunsley.springdata.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@Valid
@Entity
public class Foo implements Serializable {
    private static final long serialVersionUID = 1234567L;

    @Id
    private Long id;

    @Column
    @Pattern(regexp = "^[a-zA-Z0-9]{1,25}$")
    private String name;

    @Column
    @Max(10)
    @Min(1)
    private int type;

    @OneToMany(mappedBy = "foo")
    private Set<Bar> bars;
}
