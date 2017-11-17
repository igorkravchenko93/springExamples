package com.kravchenko.service.macrocommand;

public class Deploy extends Stage {
    public Deploy(String id) {
        super(id);
    }

    @Override
    void execute(Step step) {
        System.out.println("deploy id = " + id );
        step.doScript();
    }
}
