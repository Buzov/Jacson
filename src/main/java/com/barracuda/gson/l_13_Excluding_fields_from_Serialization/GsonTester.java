package com.barracuda.gson.l_13_Excluding_fields_from_Serialization;

import java.lang.reflect.Modifier;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {

    public static void main(String args[]) {
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
        Gson gson = builder.create();

        Student student = new Student();
        student.setRollNo(1);
        student.setName("Mahesh Kumar");
        student.setVerified(true);
        student.setId(1);
        student.className = "VI";

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}

class Student {

    private int rollNo;
    private String name;
    private boolean verified;
    private transient int id;
    public static String className;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isVerified() {
        return verified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
