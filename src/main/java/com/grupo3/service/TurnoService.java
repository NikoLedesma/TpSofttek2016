package com.grupo3.service;

import java.util.List;

import com.grupo3.entity.Turno;

public interface TurnoService {

	List<Turno> findAllTurnos(int idAfiliado);

}
