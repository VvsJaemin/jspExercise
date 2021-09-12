package com.khnp.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khnp.login.domain.Board;
import com.khnp.login.repository.BoardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
public class BoardController {

	private final BoardRepository repository;

	@GetMapping("/boardList")
	public String boardList(Model model, @RequestParam(name="currentPage", defaultValue = "0") int currentPage) {
		int pageSize = 10;
		Pageable pageable = PageRequest.of(currentPage, pageSize, Sort.by("no").ascending());
		Page<Board> page = repository.findAll(pageable);
		model.addAttribute("page", page);
		return "boardList";

	}

	@GetMapping("/addBoard")
	public String addBoard() {
		return "addBoard";
	}

	@PostMapping("/addBoard")
	public String addBoard(Board board) {
		log.info(board);
		repository.save(board);
		return "redirect:/boardList";

	}

	@GetMapping("/modifyBoard")
	public String modifyBoard(Model model, @RequestParam(name = "no") int no) {
		Optional<Board> opt = repository.findById(no);
		Board board = opt.get();
		model.addAttribute("board", board);
		return "modifyBoard";
	}

	@PostMapping("/modifyBoard")
	public String modifyBoard(Board board) {
		repository.save(board);
		return "redirect:/boardList";
	}

	@GetMapping("/removeBoard")
	public String removeBoard(@RequestParam(name = "no") int no) {
		repository.deleteById(no);
		return "redirect:/boardList";
	}

}
