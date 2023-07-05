package com.cg.addbook.model;

import org.springframework.data.annotation.Id;

public class AddBook {
	@Id
	private String title;
	private String author;
	private String img;
	private int price;
	private String featured;
	public AddBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddBook(String title, String author, String img, int price, String featured) {
		super();
		this.title = title;
		this.author = author;
		this.img = img;
		this.price = price;
		this.featured = featured;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFeatured() {
		return featured;
	}
	public void setFeatured(String featured) {
		this.featured = featured;
	}
	@Override
	public String toString() {
		return "AddBook [title=" + title + ", author=" + author + ", img=" + img + ", price=" + price + ", featured="
				+ featured + "]";
	}
	
	

}
