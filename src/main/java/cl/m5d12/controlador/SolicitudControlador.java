package cl.m5d12.controlador;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import cl.m5d12.dao.Usuario;
import cl.m5d12.servicio.SolicitudServicio;
import cl.m5d12.servicio.UsuarioServicio;

@Controller
public class SolicitudControlador {
	
	@Autowired
	SolicitudServicio ss;
	
	@Autowired
	UsuarioServicio us;
	
	@RequestMapping("/listarsolicitudes")
	public String versol(Model m) {
		List<Solicitud> listasolicitud = ss.listaSolicitud();
		m.addAttribute("lsolicitud",listasolicitud);
		return "listadosolicitud";
	}
	
    @RequestMapping("/solform")    
    public String showformulario(Model m, Model mo, String rut, HttpServletRequest request){
    	
    	Principal principal = request.getUserPrincipal();
    	System.out.println(request.getUserPrincipal());
    	System.out.println(principal.getName());
    	String id = principal.getName();
    	Usuario user = us.buscaRut(id);
    	System.out.println(user.getNombre());
    	System.out.println(user.getUsuarioid());
    	
    	mo.addAttribute("idcliente", user);
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

    @RequestMapping(value="/savesoli", method = RequestMethod.POST)    
    public String saveSolicitud(@ModelAttribute("sol") Solicitud soli){    
        ss.agregarSolicitud(soli);;
        return "redirect:/listarsolicitudes";
    }
    
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
