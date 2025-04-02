# Example on how to use interceptor in Spring Boot application

1. Add the configuration class that implements HandlerInterceptor interface
2. Implement preHandle, postHandle and afterCompletion methods
3. Register the interceptor in the WebMvcConfigurer
4. This WebMvcConfigurer is created as configuration class