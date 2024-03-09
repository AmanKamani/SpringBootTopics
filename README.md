# Spring Boot Fundamentals

- Core spring boot project will have only: \
`org.springframework.boot:spring-boot-starter`\
`org.springframework.boot:spring-boot-starter-test`
- `@SpringBootApplication` performs 2 tasks mainly:
  - `@ComponentScan` (Finds for spring managed beans annotations: like, `@Configuration`, `@Component`, `@Controller`,...)
  - `@EnableAutoConfiguration` Enable auto-configuration of the Spring Application Context, attempting to guess and configure beans that you are likely to need

- `spring-boot-start` only contains the `@Controller` and not the `@RestController`, `@RequestMapping`, `@GetMapping`,.... annotations. To access those, we need to have spring web(MVC) dependency
- annotations accessing envs or having expressions follows the **SpEL (Spring Expression Language)** syntax.

## Diffs
- `@Component` is parent of @Repository, @Service, @Controller
- `@Repository` converts the checked exceptions to RuntimeExceptions
- `@Service` can be used interchangeably with @Component. But @Service is mainly used for business logic
- `@Controller` dispatcher scans classes with this annotations to serve the HTTP requests.


## References:

### Docs
1. [Spring Boot Concepts](https://www.geeksforgeeks.org/spring-boot/?ref=shm)
2. [Spring MVC Concepts](https://www.geeksforgeeks.org/spring-mvc/?ref=shm)

### Video
1. [Basics](https://www.youtube.com/watch?v=aS9SQITRocc)
2. [Stereotype Annotations](https://www.youtube.com/watch?v=-QyD3ueqYro)
3. [@Bean vs @Component](https://www.youtube.com/watch?v=CWEQ-1vff1o)
4. [Spring Boot AutoConfigure Under the Hood](https://www.youtube.com/watch?v=zSJFx0iyrq4)

### Playlists
1. [Basic Concepts](https://www.youtube.com/playlist?list=PLyHJZXNdCXsdXxY8wupiLenux2Yafn1lN)
