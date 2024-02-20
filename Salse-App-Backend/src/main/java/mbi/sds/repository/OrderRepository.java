package mbi.sds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mbi.sds.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
