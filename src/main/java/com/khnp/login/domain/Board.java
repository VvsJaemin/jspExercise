package com.khnp.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "boards")
public class Board {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	@Column(name = "title", nullable = false, length = 255)
	private String title;
	@Column(name = "content", nullable = false, columnDefinition = "text")
	private String content;
	@Column(name = "writer", nullable = false, length = 50)
	private String writer;
}
