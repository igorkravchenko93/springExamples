package com.kravchenko.service.macrocommand;

import java.util.List;

public class Pipeline {

    private List<Stage> stages;

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public void executeStages(){
        for (Stage stage : stages) {
            stage.executeAllSteps();
        }
    }
}
