package com.kravchenko.service.macrocommand;

public class Step {

    private String id;

    public Step(String id) {
        this.id = id;
    }

    void doScript() {
        System.out.println("    script executed " + id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
