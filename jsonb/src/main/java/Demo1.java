import jakarta.json.Json;
import jakarta.json.JsonConfig;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.json.bind.config.PropertyOrderStrategy;
import jakarta.json.stream.JsonGenerator;
import to.Customer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        Customer c1 = new Customer("C001",
                "Sohan",
                "Moratuwa",
                new String[]{"011-1234567", "022-1234567"});

        // 1 - JSONP
        JsonObjectBuilder json = Json.createObjectBuilder().add("id", c1.getId())
                .add("name", c1.getName())
                .add("address", c1.getAddress())
                .add("contacts", Json.createArrayBuilder(Arrays.asList(c1.getContacts())));
        Map<String, Boolean> config1 = new HashMap<>();
        config1.put(JsonGenerator.PRETTY_PRINTING, true);
        Json.createWriterFactory(config1).createWriter(System.out).write(json.build());

        System.out.println("=========================================");

        // 2 - JSONB
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        //jsonbConfig.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        String jsonCustomer = jsonb.toJson(c1);
        System.out.println(jsonCustomer);
    }
}

