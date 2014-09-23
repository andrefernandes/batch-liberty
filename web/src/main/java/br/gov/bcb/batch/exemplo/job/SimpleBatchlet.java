package br.gov.bcb.batch.exemplo.job;

import javax.batch.runtime.context.JobContext;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

/**
 * Simple batchlet that implements "stop" in a proper way.
 *
 * Created by andre on 9/20/14.
 */
public class SimpleBatchlet implements javax.batch.api.Batchlet {

    @Inject
    JobContext jobContext;
    @Inject
    StepContext stepContext;

    boolean parar = false;

    @Override
    public String process() throws Exception {
        System.out.println("SimpleBatchlet.process...");
        long executionId = 0;
        executionId = jobContext.getExecutionId();
        String rc = "SUCCESS";
        for (int i = 0; i < 10; i++) {
            System.out.println("SimpleBatchlet " + executionId + " - passo " + i);
            Thread.sleep(3000);
            if (parar) {
                rc = "STOPPED";
                break;
            }
        }
        return rc;
    }

    @Override
    public void stop() throws Exception {
        parar = true;
    }
}
