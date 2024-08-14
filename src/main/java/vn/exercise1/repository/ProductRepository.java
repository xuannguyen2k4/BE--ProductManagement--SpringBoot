package vn.exercise1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.exercise1.entity.Product;

import java.math.BigDecimal;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByProductNameContainingAndPriceBetween(String name, BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);
}


