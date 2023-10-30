package com.recruitment.repository.client.person_register;

import com.recruitment.entity.client.PersonRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for PersonRegister
 *
 * @author HaiNH
 */
@Repository
public interface PersonRegisterRepository extends JpaRepository<PersonRegister, Long> {

}
