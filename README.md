# SpringFeaturesDemo - A simple Spring based Web App project with Java configuration


1. Uses java based configuration. WebApplicationInitializer is an interface provided by Spring MVC that ensures your implementation is detected and automatically used to initialize any Servlet 3 container.
2. Uses logback/slf4j for logging. Make sure logback.xml is in the classpath. If it is not you can use -DLogback.configurationFile=/path/to/Logback.xml
3. Uses lombok to generate some of the supporting methods needed like getter/setters, toString etc
4. Uses both root application context and web application context - http://opensourceforgeeks.blogspot.in/2015/09/context-loading-in-spring-mvc.html
5. Your common data sources and services should go in root application context
6. Your web application specific settings like controllers, handler mappings , view resolvers should go in web application context.
7. This project also demonstrates how to load properties from properties file using @PropertySource annotation and use it in your code. Note @Value("${adminName}") first checks if environment variable with same name exists. If yes it uses it. if not it will check for similar name setting in configured properties file.
8. For xml based spring configuration check out - https://github.com/aniket91/WebDynamo
9. For dependency management maven is used (see pom.xml file). But you are free to use any dependency management tool.