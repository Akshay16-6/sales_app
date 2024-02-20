package mbi.sds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mbi.sds.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
