import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import to.Customer;

import java.io.StringReader;

public class Demo3 {

    public static void main(String[] args) {
        String json = """
                {
                    "id": "C001",
                    "address": "Galle",
                    "name": "Sohan",
                    "contacts": ["011-1234567", "022-1234567", "033-1234567"]
                }
                """;

        // 1) JSONP
        JsonObject c1 = Json.createReader(new StringReader(json)).readObject();
        String id = c1.getString("id");
        String address = c1.getString("address");
        String name = c1.getString("name");
        String[] contacts = {c1.getJsonArray("contacts").getString(0),
                c1.getJsonArray("contacts").getString(1),
                c1.getJsonArray("contacts").getString(2)};
        Customer customer = new Customer(id, name, address, contacts);
        System.out.println(customer);

        // 2) JSONB
        Jsonb jsonb = JsonbBuilder.create();
        Customer customer2 = jsonb.fromJson(json, Customer.class);
        System.out.println(customer2);
    }
}
