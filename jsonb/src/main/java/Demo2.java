import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import to.Student;

public class Demo2 {
    public static void main(String[] args) {
        Student student = new Student("S001", "Kasun");
        Jsonb jsonb = JsonbBuilder.create();
        jsonb.toJson(student, System.out);
    }
}
