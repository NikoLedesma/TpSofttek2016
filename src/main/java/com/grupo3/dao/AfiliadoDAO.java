package com.grupo3.dao;

import java.util.List;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;

public interface AfiliadoDAO {

	
	public void saveAfiliado(Afiliado afiliado);

	public void updateAfiliado(Afiliado afiliado);

	public void deleteAfiliado(Afiliado afiliado);
	
	public List <Afiliado> getAfiliado(Afiliado afiliado);

	public Afiliado getAfiliadoUpdate(AfiliadoDTO afiliadoDTO);
}
