package com.ecomp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *Created by AmareshKumar on 21/3/17.
 */
@Entity
@Table(name = "ECOMP")
public class EcompModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
	private String name;
    @Column
    private String status;
    @Column
    private String account_open_Date;
    @Column
    private String account_balance;

    public EcompModel() {
    }

    public EcompModel(String name, String status, String account_open_Date, String account_balance) {
        this.name = name;
        this.status = status;
        this.account_open_Date = account_open_Date;
        this.account_balance = account_balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccount_open_Date() {
        return account_open_Date;
    }

    public void setAccount_open_Date(String account_open_Date) {
        this.account_open_Date = account_open_Date;
    }

    public String getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(String account_balance) {
        this.account_balance = account_balance;
    }

}

