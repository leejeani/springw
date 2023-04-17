package org.example.product;

import org.example.frame.Dao;
import org.example.frame.Service;
import org.example.vo.ProductVO;

import java.util.List;


public class ProductService implements Service<Integer, ProductVO> {

	Dao<Integer,ProductVO> dao;
	
	
	public ProductService(Dao<Integer, ProductVO> dao) {
		this.dao = dao;
	}

	@Override
	public void register(ProductVO v) {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) {
		dao.delete(k);
	}

	@Override
	public void modify(ProductVO v) {
		dao.update(v);
	}

	@Override
	public ProductVO get(Integer k) {
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() {
		return dao.select();
	}

}
