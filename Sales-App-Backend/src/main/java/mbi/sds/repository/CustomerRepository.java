package mbi.sds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mbi.sds.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
