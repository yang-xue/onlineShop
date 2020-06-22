package onlineShopApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShopApp.dao.CartDao;
import onlineShopApp.model.Cart;

@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
   	 return cartDao.getCartById(cartId);
    }
}

