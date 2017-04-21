package com.ecomp.model;

/**
 *Created by AmareshKumar on 21/3/17.
 */public class EcompModel {

    private String id;
    private String name;
    private String status;
    private String account_open_Date;
    private String account_balance;

    public EcompModel() {
    }

    public EcompModel(String name, String status, String account_open_Date, String account_balance) {
        this.name = name;
        this.status = status;
        this.account_open_Date = account_open_Date;
        this.account_balance = account_balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

