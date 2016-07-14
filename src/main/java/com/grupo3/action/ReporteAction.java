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
import com.grupo3.service.AfiliadoService;
import com.grupo3.util.DataPerson;
import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class ReporteAction {

	AfiliadoDTO afiliadoDTO;
	AfiliadoService afiliadoService;


	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}

	public String retrievePdf() throws JRException, IOException{
		String fileName= "elReportePosta";
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response= ServletActionContext.getResponse();
		JasperReport jasperReport = this.getCompiledFile(fileName, request);

		Afiliado afiliado= afiliadoService.getAfiliadoById(afiliadoDTO.getId());
		Map parameters = new HashMap();
		parameters.put("nombreAfiliado", afiliado.getNombreApellido());
		parameters.put("dniAfiliado",afiliado.getNumeroDoc());
		parameters.put("nroAfiliado",Integer.toString( afiliado.getId()));
		
		
		
		//////////////aca hago para pasar mi lista como un dataSource y mis parametros con un hash
		
		ArrayList<DataPerson> dataPersons= new ArrayList<DataPerson>();
		DataPerson dt1= new DataPerson();
		dt1.setId(1);
		dt1.setName("niko");
		dt1.setCountry("argentina");
		
		DataPerson dt2= new DataPerson();
		dt2.setId(2);
		dt2.setName("ivan");
		dt2.setCountry("argentina");
		
		DataPerson dt3= new DataPerson();
		dt3.setId(3);
		dt3.setName("betoben");
		dt3.setCountry("haiti");
		
		DataPerson dt4= new DataPerson();
		dt4.setId(4);
		dt4.setName("carlos");
		dt4.setCountry("argentina");
		
		DataPerson dt5= new DataPerson();
		dt5.setId(5);
		dt5.setName("luis");
		dt5.setCountry("villasoldate");
		
		DataPerson dt6= new DataPerson();
		dt6.setId(6);
		dt6.setName("nacho");
		dt6.setCountry("isla de pascuas");
		
		dataPersons.add(dt1);
		dataPersons.add(dt2);
		dataPersons.add(dt3);
		dataPersons.add(dt4);
		dataPersons.add(dt5);
		dataPersons.add(dt6);
		
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
