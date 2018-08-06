package com.lanou.serviceImpl;

import com.lanou.dao.ShoppingCarMapper;
import com.lanou.model.Goods;
import com.lanou.model.ShoppingCar;
import com.lanou.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lanou on 2018/8/3.
 */

@Service("ShoppingCarService")

public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    public List<Goods> findShoppingCar(String email) {
         List<Goods> shoppingCar =  shoppingCarMapper.findShoppingCar(email);
         return  shoppingCar;
    }

    public int  insert(ShoppingCar shoppingCar) {
        return  shoppingCarMapper.insert(shoppingCar);

    }

    public List<Goods> findShoppingCarByProdeuctId(ShoppingCar shoppingCar) {
        return  shoppingCarMapper.findShoppingCarByProdeuctId(shoppingCar.getsProductid());
    }
}
