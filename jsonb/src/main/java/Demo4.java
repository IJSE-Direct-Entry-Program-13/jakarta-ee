import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import to.Employee;
import to.Employee2;

public class Demo4 {
    public static void main(String[] args) {
        String json = """
                {
                  "employee_id": "E001",
                  "emp_name": {
                    "first": "Kasun",
                    "middle": "Sampath",
                    "last": "Heawage"
                  },
                  "qualifications": {
                    "degree": null,
                    "diploma": ["se", "cs", "it"]
                  },
                  "married": true,
                  "contact": "011-1234567"
                }
                """;
        Jsonb jsonb = JsonbBuilder.create();
        Employee employee = jsonb.fromJson(json, Employee.class);
        System.out.println(employee);

        Employee2 employee2 = jsonb.fromJson(json, Employee2.class);
        System.out.println(employee2);
    }
}
