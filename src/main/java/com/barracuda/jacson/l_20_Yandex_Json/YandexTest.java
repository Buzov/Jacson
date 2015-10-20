package com.barracuda.jacson.l_20_Yandex_Json;

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
        Word word = mapper.readValue(new File("./json/result/yandex_20.json"), Word.class);
        System.setProperty("console.encoding", "UTF-8");
        System.out.println(word);
        System.out.println("taɪm");
    }
}
