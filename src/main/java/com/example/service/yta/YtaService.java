package com.example.service.yta;

import java.util.List;

import com.example.model.Thuoc;
import com.example.model.Yta;

public interface YtaService {
	public Yta addYta(Yta yta);
	public Yta updateYta(Yta yta);
	public boolean deleteYta(int id);
	public List<Yta> getAllYta();
}