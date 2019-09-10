package me.adedoja.category;

public class Category {
    private int id;
    private String name;
    private int parent_id;
    private int date_added;

    public Category(int id, String name, int parent_id, int date_added) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.date_added = date_added;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate_added() {
        return date_added;
    }

    public void setDate_added(int date_added) {
        this.date_added = date_added;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }
}
