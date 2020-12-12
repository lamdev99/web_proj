package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Entity
@Data
@NoArgsConstructor
@Table(name = "tblthongtinbn")
public class ThongtinBenhnhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "cmt")
	private String cmt;
	@Column(name = "trangthai")
	private int trangthai;
	@Column(name = "solankham")
	private int solankham;
}
