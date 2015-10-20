package com.barracuda.jacson.l_11_Convert_Java_object_to_from_JSON;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RT
 */
public class User {

    private int age = 29;
    private String name = "mkyong";
    private List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};;

	//getter and setter methods    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    //getter and setter methods
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", "
                + "messages=" + messages + "]";
    }
}
