package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;
    private String name;

    public String execute() {
        messageStore = new MessageStore();
        if (name != null) {
            messageStore.setName(name);
        }

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
