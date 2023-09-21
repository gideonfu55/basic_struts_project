package org.apache.struts.helloworld.model;
public class MessageStore {

    private static final String GREETING = "Hello Struts User, ";
    private String name;
    private String customGreeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setCustomGreeting(GREETING + getName());
    }

    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }

    public MessageStore() {
        setCustomGreeting(GREETING + getName());
    }
}
