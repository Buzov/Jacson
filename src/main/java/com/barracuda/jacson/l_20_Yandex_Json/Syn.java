package com.barracuda.jacson.l_20_Yandex_Json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author RT
 */
public class Syn {

    private String text;
    private String pos;
    private String gen;
    private String anm;

    public Syn() {

    }

    public Syn(@JsonProperty("text") String text,
            @JsonProperty("pos") String pos,
            @JsonProperty("gen") String gen,
            @JsonProperty("anm") String anm) {
        this.text = text;
        this.pos = pos;
        this.gen = gen;
        this.anm = anm;
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

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getAnm() {
        return anm;
    }

    public void setAnm(String anm) {
        this.anm = anm;
    }

    @Override
    public String toString() {
        return "Syn{" + "text=" + text + ", pos=" + pos + ", gen=" + gen + ", anm=" + anm + '}';
    }

}
