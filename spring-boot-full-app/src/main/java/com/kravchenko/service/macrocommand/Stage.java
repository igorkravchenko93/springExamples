package com.kravchenko.service.macrocommand;

import java.util.ArrayList;
import java.util.List;

public abstract class Stage {

    protected String id;

    public Stage(String id) {
        this.id = id;
    }

    private List<Step> steps = new ArrayList<>();

    public void executeAllSteps() {
        for (Step step : steps) {
            execute(step);
        }
    }

    abstract void execute(Step step);

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
