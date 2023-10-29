package com.recruitment.repository.person_register;

import com.recruitment.entity.PersonRegister;

import java.util.List;
import java.util.Optional;

/**
 * Repository for PersonRegister
 *
 * @author HaiNH
 */
public interface PersonRegisterRepository {

    /**
     * Select PersonRegisterEntity by id
     *
     * @param id Integer
     * @return Optional<PersonRegisterEntity>
     */
    Optional<PersonRegister> findById(Integer id);

    /**
     * Insert PersonRegisterEntity
     *
     * @param entity PersonRegisterEntity
     * @return int
     */
    int insert(PersonRegister entity);

    /**
     * Update PersonRegisterEntity
     *
     * @param entity PersonRegisterEntity
     * @return int
     */
    int update(PersonRegister entity);

    /**
     * Delete PersonRegisterEntity
     *
     * @param entity PersonRegisterEntity
     * @return int
     */
    int delete(PersonRegister entity);

    /**
     * Insert list PersonRegisterEntity
     *
     * @param entityList List<PersonRegisterEntity>
     * @return int[]
     */
    int[] insert(List<PersonRegister> entityList);

    /**
     * Update list PersonRegisterEntity
     *
     * @param entityList List<PersonRegisterEntity>
     * @return int[]
     */
    int[] update(List<PersonRegister> entityList);

    /**
     * Delete list PersonRegisterEntity
     *
     * @param entityList List<PersonRegisterEntity>
     * @return int[]
     */
    int[] delete(List<PersonRegister> entityList);
}
