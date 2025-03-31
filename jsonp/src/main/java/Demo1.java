import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        String json1 = """
                {
                    "name": "Buddhi",
                    "id": "C001",
                    "age": 18
                }
                """;
        Map<String, String> map = parseJson(json1);
        System.out.println("Id: " + map.get("id"));
        System.out.println("Name: " + map.get("name"));
        System.out.println("Age: " + map.get("age"));

        String json2 = """
                {
                    "name": {
                        "first": "Kasun",
                        "last": "Sampath"
                    },
                    "address": "Galle"
                }
                """;
        Map<String, String> map2 = parseJson(json2);
        System.out.println("Name: " + map2.get("name"));
        System.out.println("Address: " + map2.get("address"));

        String json3 = """
                [10,20,30,40]
                """;
        Map<String, String> map3 = parseJson(json3);
        System.out.println(map3);
    }

    private static Map<String, String> parseJson(String json) {
        Pattern pattern = Pattern.compile("\"(?<key>[A-Za-z0-9]+)\"\\s*:\\s\"?(?<value>.+)\"?");
        Matcher matcher = pattern.matcher(json);
        Map<String, String> map = new HashMap<>();
        while (matcher.find()) {
            map.put(matcher.group("key"), matcher.group("value").replaceAll("\",?",
                    ""));
        }
        return map;
    }
}
