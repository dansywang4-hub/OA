package org.example.oa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@SpringBootApplication
public class OaReferenceApplication {
  public static void main(String[] args) { SpringApplication.run(OaReferenceApplication.class,args); }
  @RestController static class PublicInfo {
    @GetMapping("/api/public/info") public Map<String,String> info() {
      return Map.of("name","OA Reference Kit","status","demo");
    }
  }
}
