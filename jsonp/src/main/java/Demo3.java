import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;

public class Demo3 {

    public static void main(String[] args) {
        JsonObjectBuilder ob = Json.createObjectBuilder();
        ob.add("name", "Kasun");
        ob.add("age", 18);
        ob.add("id", "C001");
        //System.out.println(ob.build());

        JsonArrayBuilder ab = Json.createArrayBuilder();
        ab.add("first");
        ab.add(10);
        ab.add(true);
        ab.add(ob.build());
        ab.add("last");
        System.out.println(ab.build());
    }
}
