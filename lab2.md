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
                String[] words = queries.get(i).split("\\.");  
                printing += words[0] + ". " + words[1] + "\n";
            }
            return String.format(printing);
        } else if (url.getPath().equals("/add-message") && url.getQuery().startsWith("s")) {
            String[] parameters = url.getQuery().split("=");
            String query = Integer.toString(queries.size() + 1) + "." + parameters[1];
            queries.add(query);

            String printing = "";
            for (int i = 0; i < queries.size(); i++) {  
                String[] words = queries.get(i).split("\\.");  
                printing += words[0] + ". " + words[1] + "\n";
            }
            return String.format(printing);
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

### "/add-message?s="
![](addinghello.png)
![](addingbye.png)
The methods that are being called is handleRequest(URI url) in the class Handler. The relevant arguments to the handleRequest method is the URI object representing the input URL. For this example, the url object represents the URL (".../add-message?s=hello") and (".../add-message?s=bye"). We created an ArrayList called queries, that stores the messages. The handleRequest accesses the queries ArrayList and modifies it. The input message "hello" and "bye" are extracted from the URL and is added to the queries ArrayList as a numbered entry, thus the queries ArrayList is now queries = ["1.hello", "2.bye"]. If more requests are made, the list will grow accordingly and additional messages will be added to the queries ArrayList.

### "/"
![](rootmessage.png)
If the url object is being called without a path, meaning if the root URL is called ("/"). The handleRequest accesses the queries ArrayList and prints out the queries by splitting each entry into two parts, index and message, and concatenating them with a space, followed by a newline character. The displayed content is dynamic and changes in response to messages added using the "/add-message" path. Each time the root URL is called, the list of messages saved in the queries ArrayList is dynamically generated.

## Part 2
![](gettingsshkey.png)

### Path to the private key for your SSH key for logging into ieng6 (on your computer)
![](privatekey.png)
The path to the private key is /Users/atwins/.ssh/id_rsa.

### Path to the public key for your SSH key for logging into ieng6 (within your account on ieng6)
![](publickey.png)
The path to the public key is /Users/atwins/.ssh/id_rsa.pub.

### Terminal interaction where you log into ieng6 with your course-specific account without being asked for a password
![](terminalinteraction.png)

## Part 3
Something that I learned during weeks 2 and 3, that I did not know before, was about the components of URLs. I now understand how web addresses are structured with domain names, paths, query parameters, and fragment identifiers and how to use handlers to interact with them. In addition, I learned about Secure Shell (SSH) protocol, which allows secure access to servers on different computers over a network. While I did know that servers can be accessed remotely, I did not know how to do it, this can be beneficial in remote collaboration and server management. 
