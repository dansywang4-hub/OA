package org.example.oa.auth;
import java.util.Map;
import java.util.Set;
import java.util.Locale;
/** Educational authorization policy; enforce real permissions on the server. */
public final class RbacPolicy {
  private final Map<String,Set<String>> grants;
  public RbacPolicy(Map<String,Set<String>> grants) { this.grants=Map.copyOf(grants); }
  public boolean allowed(Set<String> roles,String permission) {
    if(roles==null || permission==null || permission.isBlank()) return false;
    return roles.stream().anyMatch(role->grants.getOrDefault(role,Set.of()).contains(permission));
  }
  public boolean routeAllowed(Set<String> roles,String method,String route) {
    if(method==null || route==null) return false;
    return allowed(roles,"route:"+method.toUpperCase(Locale.ROOT)+":"+route);
  }
}
