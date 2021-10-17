package com.relevel.personalloan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {

    @Id
    private long loan_id;
}
