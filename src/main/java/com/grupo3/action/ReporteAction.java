package com.grupo3.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Turno;
import com.grupo3.service.AfiliadoService;
import com.grupo3.service.TurnoService;
import com.grupo3.util.DataPerson;
import com.opensymphony.xwork2.Action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ReporteAction {

	AfiliadoDTO afiliadoDTO;
	AfiliadoService afiliadoService;
	TurnoService turnoService;

	public TurnoService getTurnoService() {
		return turnoService;
	}

	public void setTurnoService(TurnoService turnoService) {
		this.turnoService = turnoService;
	}

	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String retrievePdf() throws JRException, IOException{
		String fileName= "elReportePosta";
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response= ServletActionContext.getResponse();
		JasperReport jasperReport = this.getCompiledFile(fileName, request);
		///LLenamos los parametros
		int idAfiliado=afiliadoDTO.getId();
		Afiliado afiliado= afiliadoService.getAfiliadoById(idAfiliado);
		Map parameters = new HashMap();
		parameters.put("nombreAfiliado", afiliado.getNombreApellido());
		parameters.put("dniAfiliado",afiliado.getNumeroDoc());
		parameters.put("nroAfiliado",Integer.toString( afiliado.getId()));
		//Taemos los turnos

		List<Turno> turnos= turnoService.findAllTurnosByIdAfiliado(idAfiliado);
		ArrayList<DataPerson> dataPersons= new ArrayList<DataPerson>();
		//////////////aca hago para pasar mi lista como un dataSource y mis parametros con un hash
		DataPerson d=null;
		for(Turno t:turnos){
			d=new DataPerson();
			d.setNombrePractica(t.getPractica().getPractica());
			d.setImporte(t.getImporte());
			d.setHorarioAtencion(null);
			d.setHorarioLlegada(null);
			d.setNroTurno(t.getId());
			d.setObservaciones(t.getObservaciones());
			d.setPlanMedico(Integer.toString(t.getPlan()));
			d.setNombrePrestador(t.getPrestador().getApellidoYNombre());
			
			dataPersons.add(d);
		}
		
		
		
//		DataPerson dt1= new DataPerson();
//		dt1.setNombrePractica("traumato");
//		dt1.setImporte(13.2f);
//		dt1.setHorarioAtencion(null);
//		dt1.setHorarioLlegada(null);
//		dt1.setNroTurno(234);
//		dt1.setObservaciones("sdsds");
//		dt1.setPlanMedico("maa");
//		dataPersons.add(dt1);
		
		//XXX:tengo que llenar la lista de objetos...	
		
		
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataPersons);

		
		JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, parameters,beanColDataSource);		 
		generateReportPDF(response, jasperPrint);
		return Action.NONE;
	}

		
	private void generateReportPDF(HttpServletResponse response,  JasperPrint jasperPrint) throws JRException, IOException{		
		byte [] bytes=null;
		bytes=JasperExportManager.exportReportToPdf(jasperPrint);
		//bytes = JasperRunManager.runReportToPdf(jasperReport, parameters,conn);//los parametros son para ser usados en el jxls
		response.reset();
		response.resetBuffer();
		response.setHeader("Content-Disposition", "inline; filename=\"turnos.pdf\"");//si cambiamos  inline por attachment lo baja directamente
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		ServletOutputStream outputStream = response.getOutputStream();
		outputStream.write(bytes,0,bytes.length);	
		outputStream.flush();		
		outputStream.close();
	}
	
		
	private JasperReport getCompiledFile(String fileName, HttpServletRequest request) throws JRException {
		  InputStream inputStream= (InputStream) this.getClass().getClassLoader().getResourceAsStream("jasper/elReportePosta.jasper");	 
		  JasperReport jasperReport= (JasperReport)JRLoader.loadObject(inputStream);
	           return jasperReport;	
	}
	
	
	
	
	
	
	
	
	
	
	

	

	public AfiliadoService getAfiliadoService() {
		return afiliadoService;
	}


	public void setAfiliadoService(AfiliadoService afiliadoService) {
		this.afiliadoService = afiliadoService;
	}

	
}
