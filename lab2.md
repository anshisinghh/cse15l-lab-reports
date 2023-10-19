# Lab Report 2 - Servers and SSH Keys

## Part 1

### StringServer.java
```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> queries = new ArrayList<>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            String printing = "";
            for (int i = 0; i < queries.size(); i++) {  
                String[] parameters = queries.get(i).split("\\.");  
                printing += parameters[0] + ". " + parameters[1] + "\n";
            }
            return String.format(printing);
        } else if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            String query = Integer.toString(queries.size() + 1) + "." + parameters[1];
            queries.add(query);
            return String.format("Added: %s", parameters[1]);
        }
        return "404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
```

### /add-message
![](hello.png)
Which methods in your code are called?
What are the relevant arguments to those methods, and the values of any relevant fields of the class?
How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

![](bye.png)
Which methods in your code are called?
What are the relevant arguments to those methods, and the values of any relevant fields of the class?
How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

![](add-message.png)

## Part 2

### Path to the private key for your SSH key for logging into ieng6 

### Path to the public key for your SSH key for logging into ieng6 

### Terminal interaction where you log into ieng6 with your course-specific account without being asked for a password

## Part 3

Something that I learned during week 2 and 3 that I did not before was
    - how to handle URLs/ different parts of them
    - i didnt know we could acccess servers on different computers (ssh)
    
