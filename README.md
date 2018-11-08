# github-analytics

github-analytics is a spring-boot web application that reports some information about GitHub repositories. 

Users can :

* Search for a specific repository
* See the list of contributors to that repository
* See the list of Gurus for the last 100 commits
* See the details of last 100 commits.

## How to see the Demo
For some reasons , the jar packaging is not being correctly. So for now ,if you want to see the demo please clone and
 import this as a gradle project. 
 * In github-analytics-service/src/main/resources/application.properties set your github username and password.
 * Then using the gradle plugin of your IDE(4.10.2 or later):
```bash
clean  build
```
* Then run as a Spring boot application.

