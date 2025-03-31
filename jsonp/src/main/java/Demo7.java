import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriterFactory;
import jakarta.json.stream.JsonGenerator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo7 {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader(new File("my-crazy.json"))) {
            JsonObject student = Json.createReader(reader).readObject();
            System.out.println("First Name: " + student.getJsonObject("name").getString("first"));
            System.out.println("Last Name: " + student.getJsonObject("name").getString("last"));
            System.out.println("Age: " + student.getInt("age"));
            System.out.println("Qualifications: " + student.getOrDefault("qualifications", null));
            System.out.println("Contacts:" + student.getJsonArray("contacts").toString());

            JsonObjectBuilder ob = Json.createObjectBuilder(student).add("age", 35)
                    .add("contacts", Json.createArrayBuilder(student.getJsonArray("contacts"))
                            .add("033-1234567").add("088-1234567"));

            Map<String, Object> config = new HashMap<>();
            config.put(JsonGenerator.PRETTY_PRINTING, true);
            JsonWriterFactory wf = Json.createWriterFactory(config);
            wf.createWriter(System.out).writeObject(ob.build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}