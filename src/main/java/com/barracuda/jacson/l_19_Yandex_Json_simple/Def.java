package com.barracuda.jacson.l_19_Yandex_Json_simple;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author RT
 */
public class Def {

    private String text;
    private String pos;
    private String ts;
    
    public Def() {
        
    }

    @JsonCreator
    public Def(@JsonProperty("text") String text, @JsonProperty("pos") String pos, @JsonProperty("ts") String ts) {
        this.text = text;
        this.pos = pos;
        this.ts = ts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return "\n" + text + "[" + ts + "]" + "\n" + "part of speech - " + pos;
    }
    
    

}

