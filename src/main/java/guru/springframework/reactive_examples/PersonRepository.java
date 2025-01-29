package guru.springframework.reactive_examples;

import guru.springframework.reactive_examples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


//this to mimick what Spring Data would be doing. Whether it is Mongo of JPA.
/*Usually Spring Data would automatically implement, but we will do it
  manually ourselves here.
 */
public interface PersonRepository {

    //One component
    Mono<Person> getById(Integer id);

    //Many components
    Flux<Person> findAll();
}
