package com.grupo3.service;


import java.util.ArrayList;
import java.util.List;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Afiliado;
public interface AfiliadoService {
	
       public void saveAfiliado(AfiliadoDTO afiliadoDTO);

		public void updateAfiliado(AfiliadoDTO afiliadoDTO);

		public void deleteAfiliado(AfiliadoDTO afiliadoDTO);

		public ArrayList<AfiliadoDTO> getAfiliados(AfiliadoDTO afiliadoDTO);
		
		public List<AfiliadoDTO> AfiliadoADTO(List<Afiliado> afiliados);

		public Afiliado getAfiliadoById(TurnoDTO turnoDTO);
	

}
