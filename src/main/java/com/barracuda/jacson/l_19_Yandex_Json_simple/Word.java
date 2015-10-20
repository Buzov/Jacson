package com.barracuda.jacson.l_19_Yandex_Json_simple;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author RT
 */
//@JsonIgnoreProperties({"head"})
public final class Word {

    public Head head;
    public Def def[];
    
    public Word() {
        
    }

    @JsonCreator
    public Word(@JsonProperty("head") Head head, @JsonProperty("def") Def[] def) {
        /*this.head = head;*/
        this.def = def;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Def[] getDef() {
        return def;
    }

    public void setDef(Def[] def) {
        this.def = def;
    }
   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Def def : getDef()) {
            sb.append(def);
        }
        return "------" + sb.toString() + "\n-----";
    }
  
}
