# Reference architecture

Browser → trusted server → authentication → server-side RBAC → workflow service → persistence (not implemented).

- `RbacPolicy` demonstrates deny-by-default permission checks; it is not a Spring Security filter.
- `ApprovalWorkflow` demonstrates a simple in-memory state machine. Real workflows require actor identity, locking and transactional storage.
- `FormSchema` demonstrates field metadata and required validation. Production form validation requires types, size limits, authorization and input normalization.

All data is illustrative and no internal production integration is included.
