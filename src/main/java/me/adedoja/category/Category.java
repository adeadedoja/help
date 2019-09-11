package me.adedoja.category;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int cat_id;
    private String cat_name;
    private int cat_parent_id;
    private int cat_date_added;

    public Category() { }

    public Category(int cat_id, String cat_name, int cat_parent_id, int cat_date_added) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.cat_parent_id = cat_parent_id;
        this.cat_date_added = cat_date_added;
    }

    public int getCat_date_added() {
        return cat_date_added;
    }

    public void setCat_date_added(int cat_date_added) {
        this.cat_date_added = cat_date_added;
    }

    public int getCat_parent_id() {
        return cat_parent_id;
    }

    public void setCat_parent_id(int cat_parent_id) {
        this.cat_parent_id = cat_parent_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }
}
