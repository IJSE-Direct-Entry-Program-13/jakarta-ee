public class Demo2 {

    public static void main(String[] args) {
        String id = "C001";
        String name = "Kasun";
        int age = 18;

        // String json = "{\"id\": \"C001\", \"name\": \"Kasun\", \"age\": 18}";
         String json = "{\"id\": \"%s\", \"name\": \"%s\", \"age\": %d}".formatted(id, name, age);
//        String json = """
//                {
//                "name": "%s",
//                "id": "%s",
//                "age": %d
//                }
//                """.formatted(name, id, age);
        System.out.println(json);
    }
}
