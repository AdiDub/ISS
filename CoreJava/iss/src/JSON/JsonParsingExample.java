package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingExample {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Alice\",\"age\":25,\"city\":\"New York\"}";

        // Parse JSON string to JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Access values from the JSONObject
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String city = jsonObject.getString("city");

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
