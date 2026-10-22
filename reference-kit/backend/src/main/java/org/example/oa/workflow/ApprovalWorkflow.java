package org.example.oa.workflow;
/** In-memory example only; no persistence or actor authorization. */
public final class ApprovalWorkflow {
  public enum Status { DRAFT, PENDING, APPROVED, REJECTED }
  private Status status=Status.DRAFT;
  public Status status() { return status; }
  public void submit() { transition(Status.DRAFT,Status.PENDING); }
  public void approve() { transition(Status.PENDING,Status.APPROVED); }
  public void reject() { transition(Status.PENDING,Status.REJECTED); }
  private void transition(Status expected,Status next) {
    if(status!=expected) throw new IllegalStateException("Transition not permitted from "+status);
    status=next;
  }
}
