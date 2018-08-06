package com.lanou.dao;

import com.lanou.model.Goods;
import com.lanou.model.ShoppingCar;

import java.util.List;

public interface ShoppingCarMapper {
    int insertSelective(ShoppingCar record);

    List<Goods> findShoppingCar(String email);

    int insert(ShoppingCar shoppingCar);

    List<Goods> findShoppingCarByProdeuctId(String s);
}