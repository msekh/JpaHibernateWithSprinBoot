package io.mtech.springboot.basics.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mtech.springboot.basics.model.Book;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1l, "Sekh Mahadi", "Think once again"));
	}
}
