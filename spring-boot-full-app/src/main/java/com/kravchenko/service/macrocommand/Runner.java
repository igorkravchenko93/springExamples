package com.kravchenko.service.macrocommand;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline();



        pipeline.setStages(Arrays.asList( createDeploy("d001"), createBuild("b001"), createDeploy("d001")));

        pipeline.executeStages();
    }

    private static Deploy createDeploy(String deployId) {
        Deploy deploy = new Deploy(deployId);
        deploy.setSteps(Arrays.asList(new Step("s001"), new Step("s002")));
        return deploy;
    }

    private static Build createBuild(String deployId) {
        Build build = new Build(deployId);
        build.setSteps(Arrays.asList(new Step("s001"), new Step("s002")));
        return build;
    }
}
