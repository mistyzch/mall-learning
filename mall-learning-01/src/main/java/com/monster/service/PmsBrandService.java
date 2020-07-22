package com.monster.service;

import com.monster.mbg.model.PmsBrand;

import java.util.List;

/**
 * Create by misty on 2020/7/22 20:38
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
