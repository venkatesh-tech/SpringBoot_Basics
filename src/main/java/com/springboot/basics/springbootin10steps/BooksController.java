package com.springboot.basics.springbootin10steps;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1L, "Mastering Spring", "Venkatesh"));

	}

}
