package com.lfj.demo.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/9/27.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6419523870427368550L;

    private String id;
    private String name;

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
}
