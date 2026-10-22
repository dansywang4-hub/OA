package org.example.oa.forms;
import java.util.List;
import java.util.Map;
/** Example form metadata and required-field validation. */
public record FormSchema(List<Field> fields) {
  public record Field(String key,String label,boolean required) {}
  public FormSchema { fields=List.copyOf(fields); }
  public List<String> validate(Map<String,?> input) {
    return fields.stream().filter(f->f.required() && (input==null || input.get(f.key())==null || input.get(f.key()).toString().isBlank())).map(Field::key).toList();
  }
}
