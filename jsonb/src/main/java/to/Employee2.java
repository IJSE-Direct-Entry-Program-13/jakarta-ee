package to;

import jakarta.json.bind.annotation.JsonbProperty;

import java.util.List;

public record Employee2(@JsonbProperty("employee_id") String id,
                        @JsonbProperty("emp_name") Name name,
                        Qualifications qualifications,
                        boolean married,
                        String contact) {
    public record Name(String first, String middle, String last) {}
    public record Qualifications(String degree, List<String> diploma) {}
}
