# House Plants Web-Service
This is a custom Spring Boot application with information on various house plants that I created for my Advanced Java Programming class final project. 

### About The Application
- Includes a One to Many relationship using an H2 in-memory database to display application information
- Uses Bootstrap for styling.
- A route defined as /api/ which is a fully functioning RESTful web service serving up JSON corresponding to the database entities. (There is a controller and a rest controller, for this reason.) 
- It uses Thymeleaf to iterate over the collection on the results page
- There are 2 view pages: the main results page about house plants, and then a bonus page you can reach from the menu bar with some extra information on where you can buy house plants (not included in the API)


### Set-Up Notes
- The automatic log-in will require the default password that comes up from running Spring in your IDE.
- I used Maven as a build tool in this application.
