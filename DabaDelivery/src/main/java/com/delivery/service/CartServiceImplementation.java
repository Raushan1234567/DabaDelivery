package com.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.exception.CartException;
import com.delivery.model.Cart;
import com.delivery.model.Medicine;
import com.delivery.repositry.CartRepositry;
import com.delivery.repositry.MedicineRepositry;

@Service
public class CartServiceImplementation implements CartServiceInterface {
	@Autowired
	private CartRepositry cartRepositry;
	@Autowired
	private MedicineRepositry medicineRepositry;
	@Override
	public Cart addToCart(Cart cart) {
		cartRepositry.save(cart);
		return cart;
	}

	@Override
	public Cart addMed(Integer medicineId,Integer cartId) {
	 Optional<Cart> c=	cartRepositry.findById(cartId); 
	 Optional<Medicine> m= medicineRepositry.findById(medicineId);
	 if(c.isEmpty())
		 throw new CartException("cart Not Found");
	 if(m.isEmpty())
		 throw new CartException("medicine Not Found");
	 Cart cc= c.get();
	 cc.getItemsList().add(m.get());
	 
	return cartRepositry.save(cc);
	}

	@Override
	public List<Cart> getMed() {
		List<Cart> a=cartRepositry.findAll();
		
		return a;
	}

}
