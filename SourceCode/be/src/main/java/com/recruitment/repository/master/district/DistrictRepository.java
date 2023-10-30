package com.recruitment.repository.master.district;

import com.recruitment.dto.master.DistrictDTO;
import com.recruitment.entity.master.District;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends CrudRepository<District, Integer> {

  @Query("SELECT new com.recruitment.dto.master.DistrictDTO(districtId, code, name) FROM District "
      + "WHERE provinceId = :provinceId")
  List<DistrictDTO> findAllDistrictByProvinceId(@Param("provinceId") Integer provinceId);
}
