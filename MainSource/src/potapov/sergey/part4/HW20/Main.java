package potapov.sergey.part4.HW20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        /*
        {
            "used":false,
                "source":"api",
                "type":"cat",
                "deleted":false,
                "_id":"591f98803b90f7150a19c20f",
                "__v":0,
                "text":"Fossil records from two million years ago show evidence of jaguars.",
                "updatedAt":"2020-06-30T20:20:33.478Z",
                "createdAt":"2018-01-04T01:10:54.673Z",
                "status":{
            "verified":true,
                    "sentCount":1
        },
            "user":"5a9ac18c7478810ea6c06381"
        }
        */
        try {
            URL jsonUrl = new URL("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=2");
            ObjectMapper mapper = new ObjectMapper();
            FactObject[] response = mapper.readValue(jsonUrl, FactObject[].class);
            for (FactObject fo : response
                 ) {
                System.out.println(fo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
