import org.json.JSONArray;
import org.json.JSONObject;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class jsonReader {



    public jsonReader() throws IOException {
    }

    public static JSONObject parseJSONFile(String filename) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }


}
