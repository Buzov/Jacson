package com.barracuda.jacson.l_11_Convert_Java_object_to_from_JSON;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author RT
 */
public class JSON_ToJavaObject {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            // read from file, convert it to user class
            User user = mapper.readValue(new File("./json/result/student_11.json"), User.class);

            // display to console
            System.out.println(user);

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
