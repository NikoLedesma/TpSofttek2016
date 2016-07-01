package com.grupo3.service;


import java.util.ArrayList;
import java.util.List;

import com.grupo3.dtos.AfiliadoDTO;
public interface AfiliadoService {
	
       public void saveAfiliado(AfiliadoDTO afiliadoDTO);

		public void updateAfiliado(AfiliadoDTO afiliadoDTO);

		public void deleteAfiliado(AfiliadoDTO afiliadoDTO);

		public ArrayList<AfiliadoDTO> getAfiliados(AfiliadoDTO afiliadoDTO);
	

}
