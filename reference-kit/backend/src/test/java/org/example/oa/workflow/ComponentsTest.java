package org.example.oa.workflow;
import org.example.oa.auth.RbacPolicy;
import org.example.oa.forms.FormSchema;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
class ComponentsTest {
  @Test void defaultDenyAndExplicitAllow() {
    var p=new RbacPolicy(Map.of("reviewer",Set.of("route:POST:/approvals")));
    assertFalse(p.routeAllowed(Set.of("guest"),"POST","/approvals"));
    assertTrue(p.routeAllowed(Set.of("reviewer"),"POST","/approvals"));
  }
  @Test void transitionsAreRestricted() {
    var flow=new ApprovalWorkflow(); assertThrows(IllegalStateException.class,flow::approve);
    flow.submit();flow.approve();assertEquals(ApprovalWorkflow.Status.APPROVED,flow.status());
  }
  @Test void requiredFieldCheck() {
    var form=new FormSchema(List.of(new FormSchema.Field("title","Title",true)));
    assertEquals(List.of("title"),form.validate(Map.of()));
    assertTrue(form.validate(Map.of("title","demo")).isEmpty());
  }
}
