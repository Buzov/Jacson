package com.barracuda.jacson.l_19_Yandex_Json_simple;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author RT
 */
public class YandexTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Word word = mapper.readValue(new File("./json/result/yandex_19.json"), Word.class);
        System.out.println(word);
    }
}
