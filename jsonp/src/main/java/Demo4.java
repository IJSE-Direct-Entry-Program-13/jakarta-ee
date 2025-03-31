import jakarta.json.*;
import jakarta.json.stream.JsonGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Demo4 {

    public static void main(String[] args) {
        JsonObjectBuilder nameBuilder = Json.createObjectBuilder();
        nameBuilder.add("first", "Kasun").add("last", "Sampath");

        JsonArrayBuilder contactsBuilder = Json.createArrayBuilder();
        contactsBuilder.add("011-1234567").add("077-1234567");

        JsonObjectBuilder ob = Json.createObjectBuilder();
        ob.add("name", nameBuilder)
                .add("age", 18)
                .add("qualifications", JsonValue.NULL)
                .add("contacts", contactsBuilder);

        Map<String, Object> config = new HashMap<>();
        config.put(JsonGenerator.PRETTY_PRINTING, true);
        JsonWriterFactory wf = Json.createWriterFactory(config);
        //wf.createWriter(System.out).write(ob.build());
        try (FileWriter fw = new FileWriter(new File("my-crazy.json"))) {
            wf.createWriter(fw).write(ob.build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
