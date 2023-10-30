package com.recruitment.entity.master;

import com.recruitment.entity.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(schema = "master", name = "district")
public class District extends CommonEntity {

  @Id
  @Column(name = "district_id")
  private Integer districtId;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;

  @Column(name = "province_id")
  private Integer provinceId;

}
