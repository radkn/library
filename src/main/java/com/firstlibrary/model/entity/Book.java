package com.firstlibrary.model.entity;

public class Book {
    private int id;
    private String title;
    private String description;
    private int total_amount;
    private int amount_of_free;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public int getAmount_of_free() {
        return amount_of_free;
    }

    public void setAmount_of_free(int amount_of_free) {
        this.amount_of_free = amount_of_free;
    }
}
