package com.OPS.crudeOPS.Rpository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OPS.crudeOPS.MyModel.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Optional<Product> findByName(String name);

}
