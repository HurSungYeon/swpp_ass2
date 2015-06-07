package org.apache.reef.examples.scheduler;

public interface TaskFailureHandler<T> {

  /**
   * Handles an Failure Task.
   *
   * @param value an event
   */
  public void onNext(T value);
}
