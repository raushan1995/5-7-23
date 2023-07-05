package com.cg.addbook.service;

import java.util.List;

import com.cg.addbook.model.AddBook;
import com.cg.addbook.repository.addbookrepository;

public class addbookserviceimpl implements addbookservice{
	
	private addbookrepository abr;

    @Override
    public AddBook saveAddBook(AddBook addbook) {
        return abr.save(addbook);
    }

    @Override
    public AddBook getAddBookByTitle(String title) {
        return abr.findById(title).get();
    }

	
}
