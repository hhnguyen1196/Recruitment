package com.recruitment.repository.master.province;

import com.recruitment.dto.master.ProvinceDTO;
import com.recruitment.entity.master.Province;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Integer> {

  @Query("SELECT new com.recruitment.dto.master.ProvinceDTO(provinceId, code, name) FROM Province")
  List<ProvinceDTO> findAllProvince();
}
