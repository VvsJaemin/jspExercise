package com.khnp.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khnp.login.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
