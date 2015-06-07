package org.apache.reef.examples.scheduler;

import org.apache.reef.task.Task;

import javax.inject.Inject;

public final class ForeverFailingTask implements Task {

  @Inject
  public final byte[] call(final byte[] memento) throws Exception {
    throw new Exception("testException");
  }
}
