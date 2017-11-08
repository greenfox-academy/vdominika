package com.greenfoxacademy.log.repository;

        import com.greenfoxacademy.log.model.Log;
        import com.greenfoxacademy.log.repository.*;
        import org.springframework.data.repository.CrudRepository;

public interface LogRepo extends CrudRepository<Log, Long> {


}
