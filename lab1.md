# Lab Report 1 - Remote Access and FileSystem

## *cd* - change directory

### Using *cd* with no arguments
```
[user@sahara ~]$ cd
[user@sahara ~]$
```

When the command was run the working directory was ‘/home/user’.
When *cd* is used with no arguments, it takes you to the user’s home directory, since we were already in the home directory, running *cd* had no effect on the working directory.

### Using *cd* with a path to a directory as an argument
```
[user@sahara ~]$ cd lecture1/
[user@sahara ~/lecture1]$
```

When the command was run the working directory was ‘/home/user’.
When *cd* is used with a path to a directory as an argument, it changes the working directory to the specified directory. In this situation, the user changed the working directory to ‘/home/user/lecture1’.

### Using *cd* with a path to a file as an argument
```
[user@sahara ~/lecture1/messages]$ cd en-us.txt 
bash: cd: en-us.txt: Not a directory
[user@sahara ~/lecture1/messages]$
```

When the command was run the working directory was ‘/home/user/lecture1/messages’.
When *cd* is used with a path to a file as an argument, it tries to change the working directory to that file. However, *cd* only changes to a working directory, since en-us.txt is a file not a directory, the error message “Not a directory” popped up and the *cd* command was not executed.


## *ls* - lists contents of files and directories 

### Using *ls* with no arguments
```
[user@sahara ~]$ ls
lecture1
[user@sahara ~]$ 
```
When the command was run the working directory was ‘/home/user’.
When *ls* is used with no arguments, it lists the contents of the current working directory. Our current working directory only has the directory ‘lecture1’, which gets printed out.

### Using *ls* with a path to a directory as an argument
```
[user@sahara ~]$ ls lecture1/
Hello.class  Hello.java  messages  README
[user@sahara ~]$ 
```

When the command was run the working directory was ‘/home/user’.
When *ls* is used with a path to a directory as an argument it lists the contents of that directory. The directory ‘lecture1’ has the files ‘Hello.class’, ‘Hello.java’, ‘messages’, and ‘README’, which gets printed out.

### Using *ls* with a path to a file as an argument
```
[user@sahara ~/lecture1/messages]$ ls en-us.txt 
en-us.txt
[user@sahara ~/lecture1/messages]$ 
```
```
[user@sahara ~/lecture1/messages]$ ls fr-ca.txt
ls: cannot access 'fr-ca.txt': No such file or directory
[user@sahara ~/lecture1/messages]$
```

When the command was run the working directory was ‘/home/user/lecture1/messages’.
When *ls* is used with a path to a file as an argument, it lists the specified file if it exists in the path. Since ‘en-us.txt’ exists, it prints out the file name, however, since the file ‘fr-ca.txt’ does not exist the error message “No such file or directory” pops up.	


## *cat* - reads data from a file and gives its content as output

### Using *cat* with no arguments
```
[user@sahara ~]$ cat
Hello! Testing input
Hello! Testing input
Another line
Another line
^C
[user@sahara ~]$ 
```

When the command was run the working directory was ‘/home/user’.
When *cat* is used with no arguments, it expects input from the user. I inputted “Hello! Testing input” which was then displayed back to me, same with the next line that I inputted “Another line”. Then I used ‘Ctrl+C’ to exit out of the command.

### Using *cat* with a path to a directory as an argument
```
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
[user@sahara ~]$ 
```

When the command was run the working directory was ‘/home/user’.
When *cat* is used with a path to a directory as an argument, it attempts to read it as a file. However, since ‘lecture1’ is a directory it does not have content that can be displayed as a file, thus the error message “Is a directory” pops up.

### Using *cat* with a path to a file as an argument
```
[user@sahara ~/lecture1/messages]$ cat en-us.txt 
Hello World!
[user@sahara ~/lecture1/messages]$ 
```

When the command was run the working directory was /home/user/lecture1/messages.
When *cat* is used with a path to a file as an argument, it displays the contents of the file in the terminal. Since the file ‘en-us.txt’ contains the text “Hello World!” it prints that out.

