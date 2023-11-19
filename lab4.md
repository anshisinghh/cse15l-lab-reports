# Lab Report 4 - Vim

## Log into ieng6
![](step4.png)

## Clone your fork of the repository from your Github account (using the SSH URL)
![](step5.png)

## Run the tests, demonstrating that they fail
![](step6.png)
In order to run the tests, I had to navigate into the project directory using the command *cd cse15l-lab7/*. Then I used *javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java* and *java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests* to run the test files. 

## Edit the code file to fix the failing test
![](step7.png)
In order to access the code file, I ran the command *vim ListExamples.java*.
Keys pressed: </index1><enter> This command found the first instance of “index1” and then to navigate to the one we want to change <n><n><n><n><n><n><n><n><n><l><l><l><l><l>. In order to delete the 1, press <x> and insert a 2 instead, <i><2><esc>. Then save and exit from vim using <:wq>.


## Run the tests, demonstrating that they now succeed
![](step8.png)
Keys pressed: <up><up><up><up><up><up><enter>, <up><up><up><up><up><enter> The *javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java* command was 6 up in the search history, so I used up arrow to access it. Then the *java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests* command was 5 up in the history, so I accessed and ran it in the same way.

## Commit and push the resulting change to your Github account (you can pick any commit message!)
![](step9.png)
