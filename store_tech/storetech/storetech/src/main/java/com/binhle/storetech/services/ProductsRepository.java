package com.binhle.storetech.services;

import com.binhle.storetech.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
