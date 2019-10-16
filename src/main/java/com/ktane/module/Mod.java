package com.ktane.module;

import com.ktane.Bomb;

public class Mod {
    private String name;
    private Integer label;
    private Bomb bomb;

    public Mod(String name, Integer label, Bomb bomb) {
        this.name = name;
        this.label = label;
        this.bomb = bomb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }
}
