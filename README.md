# Interview Task
1. open a terminal 
2. compile .java file to .class file
assume that you downloaded the code to your workspace of intellij, my case /Users/xingliu/IdeaProjects
copy and paste this cmd line
   javac /Users/xingliu/IdeaProjects/example/src/de/xing/tut/javacmd/Simple.java  
now you could see a Simple.class file is generated in the same directory of Simple.java
   ls -la /Users/xingliu/IdeaProjects/example/src/de/xing/tut/javacmd
3. execute the .class file
   java -classpath /Users/xingliu/IdeaProjects/example/src de.xing.tut.javacmd.Simple
