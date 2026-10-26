package com.moisecodes.schoolmis.repository;
import com.moisecodes.schoolmis.model.School;
import java.util.Optional;
import java.util.List;

//school repository contract
public interface SchoolRepository  {
    // read the school by id and use optional to overcome the nullpointer error
    Optional<School> findById(Long id);
    // read all schools
    List<School> findAll();

    //update existing school by id

    boolean update(School school);

    //delete school by id

    boolean deleteById(Long id );
   // save school
    School  save(School school);


}
