package by.byportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface DaoRepository extends JpaRepository <Employee, Integer> {

    List <Employee> findAllEmployee();


    @Query(




}
