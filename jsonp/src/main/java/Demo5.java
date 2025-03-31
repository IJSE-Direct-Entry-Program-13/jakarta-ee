import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.stream.JsonParser;

import java.io.StringReader;

import static jakarta.json.stream.JsonParser.Event.KEY_NAME;

public class Demo5 {

    public static void main(String[] args) {
        String json = """
                {
                    "name": {
                        "first": "Kasun",
                        "last": "Sampath"
                    },
                    "age": 18,
                    "qualifications": null,
                    "contacts": [
                        "011-1234567",
                        "077-1234567"
                    ]
                }
                """;
        StringReader stringReader = new StringReader(json);
        JsonParser parser = Json.createParser(stringReader);
        while(parser.hasNext()){
            JsonParser.Event evt = parser.next();
            switch (evt.name()){
                case "KEY_NAME" -> System.out.println("Key: " + parser.getString());
                case "VALUE_STRING" -> System.out.println("Value: " + parser.getString());
                case "VALUE_NUMBER" -> System.out.println("Value: " + parser.getInt());
                case "VALUE_NULL" -> System.out.println("Value: null");
            }
        }
//        JsonObject object = parser.getObject();
//        int age = object.getInt("age");
//        System.out.println("Age: " + age);
//        System.out.println("Qualifications: " + object.get("qualifications"));
//        JsonObject name = object.getJsonObject("name");
//        System.out.println("Name: " + name.getString("first") + " " + name.getString("last"));
//        JsonArray contacts = object.getJsonArray("contacts");
//        System.out.println(contacts.getString(0));
//        System.out.println(contacts.getString(1));
    }
}
