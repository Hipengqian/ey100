package com.lanou.service;

import com.lanou.model.Goods;
import com.lanou.model.ShoppingCar;

import java.util.List;

/**
 * Created by lanou on 2018/8/3.
 */
public interface ShoppingCarService {
    public List<Goods> findShoppingCar(String email);

    public  int  insert(ShoppingCar shoppingCar);

    List<Goods> findShoppingCarByProdeuctId(ShoppingCar shoppingCar);
}
