package com.grupo3.service;

import com.grupo3.entity.Afiliado;

import java.util.List;
public interface AfiliadoService {
	
       public void saveAfiliado(Afiliado afiliado);

		public void updateAfiliado(Afiliado afiliado);

		public void deleteAfiliado(Afiliado afiliado);

		public List <Afiliado> getAfiliadoByFirstName(String nombreApellido);
	

}
