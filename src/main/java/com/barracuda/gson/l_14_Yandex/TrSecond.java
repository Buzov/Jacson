package com.barracuda.gson.l_14_Yandex;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author RT
 */
public class TrSecond {

    private String text;
    
    public TrSecond() {
        
    }

    @JsonCreator
    public TrSecond(@JsonProperty("text") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
}
