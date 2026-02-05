//A shared class that sorts messages out

import java.io.Serializable;

public class message implements Serializable{
    private String username;
    private long timestamp;
    private String content;


    public message(String username, String content){
        this.username = username;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    //Function to print out a string of the message with username
    public String toString(){
        return "[" + username + "]" + content;
    }
}