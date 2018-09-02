package com.mystyle.entities;

import java.util.HashMap;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private Integer categoryId;
	private String brandName;
	private String productName;
	private Float actualPrice;
	private Float discountedPrice;
	private Integer availableQuantity;
	private HashMap<String, List<String>> specs;
	@ElementCollection
	private List<String> imageUrls;

	public Product() {
		super();
	}

	public Product(Integer productId, Integer categoryId, String brandName, String productName, Float actualPrice,
			Float discountedPrice, Integer availableQuantity, HashMap<String, List<String>> specs,
			List<String> imageUrls) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.brandName = brandName;
		this.productName = productName;
		this.actualPrice = actualPrice;
		this.discountedPrice = discountedPrice;
		this.availableQuantity = availableQuantity;
		this.specs = specs;
		this.imageUrls = imageUrls;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Float getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(Float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public HashMap<String, List<String>> getSpecs() {
		return specs;
	}

	public void setSpecs(HashMap<String, List<String>> specs) {
		this.specs = specs;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
}
