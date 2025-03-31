package to;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class Employee implements Serializable {
    @JsonbProperty("employee_id")
    private String id;
    @JsonbProperty("emp_name")
    private Name name;
    private Qualifications qualifications;
    private boolean married;
    private String contact;

    @Data @NoArgsConstructor @AllArgsConstructor
    public static class Name implements Serializable {
        private String first;
        private String middle;
        private String last;
    }

    @Data @NoArgsConstructor @AllArgsConstructor
    public static class Qualifications implements Serializable {
        private String degree;
        private String[] diploma;
    }
}
