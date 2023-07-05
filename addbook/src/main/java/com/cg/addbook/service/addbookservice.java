package com.cg.addbook.service;

import java.util.List;

import com.cg.addbook.model.AddBook;

public interface addbookservice {
	
	AddBook saveAddBook(AddBook addbook);

    AddBook getAddBookByTitle(String title);

	

}
