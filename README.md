# tutorial-microservices-dataflow-task

Download Dafllow jar <br>
http://repo.spring.io/milestone/org/springframework/cloud/spring-cloud-dataflow-server-local/1.3.0.M1/spring-cloud-dataflow-server-local-1.3.0.M1.jar <br>

> java -jar spring-cloud-dataflow-server-local-1.3.0.M1.jar <br>

For Data flow Server UI: <br>
http://localhost:9393/ <br>
Register and Deploy from UI <br>

Register app <br>
app register --name mytask --type task --uri maven://com.example:mysource:0.0.1-SNAPSHOT <br>

Go to task and Deploy <br>

uri: file:///home/user/.m2/repository/com/tutorial/springcloud-task/0.0.1-SNAPSHOT/springcloud-task-0.0.1-SNAPSHOT.jar <br>
