package cl.m5d12.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Solicitud;
import cl.m5d12.servicio.SolicitudServicio;

@Controller
public class SolicitudControlador {
	
	@Autowired
	SolicitudServicio ss;
	
	@RequestMapping("/listarsolicitudes")
	public String versol(Model m) {
		List<Solicitud> listasolicitud = ss.listaSolicitud();
		m.addAttribute("lsolicitud",listasolicitud);
		return "listadosolicitud";
	}
	
    @RequestMapping("/solform")    
    public String showformulario(Model m){
        m.addAttribute("command", new Solicitud());
        return "solform";
    } 
    
    @RequestMapping("/menusolicitudes")
    public String showmenusolicitudes() {
    	return "menusolicitudes";
    }
    
    @RequestMapping("/mainmenucli")    
    public String showmainmenu(Model m) {
        return "mainmenu";
    } 

    @RequestMapping(value="/savesoli",method = RequestMethod.POST)    
    public String saveSoli(@ModelAttribute("sol") Solicitud soli){    
        ss.agregarSolicitud(soli);;
        return "redirect:/listarsolicitudes";
    }
    	
	/*
	 * @RequestMapping("/error") public String errorLogin(ModelMap model) {
	 * model.addAttribute("error", "true"); return "login";
	 * 
	 * }
	 * 
	 * @RequestMapping("/login") public String loginUser() {
	 * System.out.println("Inside login"); return "login"; }
	 * 
	 * @RequestMapping("/logout") public String logoutUser() { Authentication auth =
	 * SecurityContextHolder.getContext().getAuthentication(); if (auth != null){
	 * SecurityContextHolder.getContext().setAuthentication(null); } return
	 * "redirect:/login?logout"; //You can redirect wherever you want, but generally
	 * it's a good practice to show login screen again. }
	 */
    
    @RequestMapping(value="/eliminarsoli/{idsolicitud}")
	public String eliminaSoli(@PathVariable int idsolicitud) {
		ss.eliminarSolicitud(idsolicitud);
		return "redirect:/listarsolicitudes";
	}
	
	@RequestMapping(value="/editsoli/{idsolicitud}")
		public String editaSoli(@PathVariable int idsolicitud, Model modelo) {
		Solicitud soli = ss.findSolicitudByid(idsolicitud);
		modelo.addAttribute("command", soli);
		
		return "editasolicitud";
	}
	

}
