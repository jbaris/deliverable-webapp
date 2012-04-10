# deliverable-webapp
This is a deliverable Java web-based application. By deliverable, I mean that this web application can be delivered to non-technical users, and they can run it with a simple click (no web application server install or configuration required). Warning: a web application packaged on this way should not have high non-functional requirements (few users and concurrency, no high availability/scalability needed) 

## How to Build
    git clone http://github.com/jbaris/deliverable-webapp  
    cd deliverable-webapp  
    mvn clean package   

## How to Run
###On Windows
    cd target  
    deliverable-webapp.exe   

###On Linux
    cd target  
    java -jar deliverable-webapp-1.0.jar  

##How to Test
Once runned, click on the "Start server" button:      
    ![](http://jbaris.github.com/deliverable-webapp/screenshot.png)    
Then, open a web browser and enter http://localhost:8080  