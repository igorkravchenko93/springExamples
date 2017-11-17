package com.kravchenko.service.macrocommand;

public class Build extends Stage {

    public Build(String id) {
        super(id);
    }

    @Override
    void execute(Step step) {
        System.out.println("build id = " + id);
        step.doScript();
    }
}
