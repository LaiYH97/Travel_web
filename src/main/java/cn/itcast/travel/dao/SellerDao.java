package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

public interface SellerDao {

    /**
     * 根据id查询Seller对象
     * @param id
     * @return
     */
    public Seller findById(int id);
}
