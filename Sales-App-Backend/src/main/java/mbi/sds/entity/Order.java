package mbi.sds.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 */
@Entity
@Data
@Table(name = "ORDER_LIST")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "order")
	private List<OrderItem> items = new ArrayList<>();
	
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createDateTime;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updateDateTime;
}