package com.citynow.smallerp.repository;

import com.citynow.smallerp.entity.LeaveForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface LeaveFormRepository extends JpaRepository<LeaveForm, Long>{

}
