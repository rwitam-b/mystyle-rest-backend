package com.mystyle.entities;

public class Test {
	private Product p;
	private ProductCategory pc;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(Product p, ProductCategory pc) {
		super();
		this.p = p;
		this.pc = pc;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public ProductCategory getPc() {
		return pc;
	}

	public void setPc(ProductCategory pc) {
		this.pc = pc;
	}

}
