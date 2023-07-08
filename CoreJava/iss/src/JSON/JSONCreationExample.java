package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonCreationExample {
    public static void main(String[] args) {
        // Create a JSONObject
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alice");
        jsonObject.put("age", 25);
        jsonObject.put("city", "New York");

        // Create a nested JSONObject
        JSONObject addressObject = new JSONObject();
        addressObject.put("street", "123 Main St");
        addressObject.put("city", "New York");
        addressObject.put("zip", "10001");

        jsonObject.put("address", addressObject);

        // Create a JSONArray
        JSONArray hobbiesArray = new JSONArray();
        hobbiesArray.put("reading");
        hobbiesArray.put("painting");
        hobbiesArray.put("swimming");

        jsonObject.put("hobbies", hobbiesArray);

        // Convert JSONObject to JSON string
        String jsonString = jsonObject.toString();

        // Print the JSON string
        System.out.println(jsonString);
    }
}
