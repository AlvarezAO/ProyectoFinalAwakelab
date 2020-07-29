package cl.m5d12.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Usuario;
import cl.m5d12.servicio.UsuarioServicio;

@Controller
public class ClienteControlador {

	@Autowired
	UsuarioServicio cs;
	
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Usuario> listacliente = cs.listarUsuario();
		m.addAttribute("lclientes",listacliente);
		return "listadoclientes";
	}
	
    @RequestMapping("/cliform")    
    public String showform(Model m){
        m.addAttribute("command", new Usuario());
        return "cliform";
    } 
    
    @RequestMapping("/mainmenu")    
    public String showmenu(Model m) {
        return "mainmenu";
    } 

    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Usuario cli){    
        cs.agregarUsuario(cli);
        return "redirect:/listarclientes";
    }
    	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "login";

    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("Inside login");
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        	SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "redirect:/login?logout"; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
    
    @RequestMapping(value="/eliminarusuario/{usuarioid}")
	public String eliminaUser(@PathVariable int usuarioid) {
		cs.eliminarUsuario(usuarioid);
		return "redirect:/listarclientes";
	}
	
	@RequestMapping(value="/editusuario/{usuarioid}")
		public String editaUser(@PathVariable int usuarioid, Model modelo) {
		Usuario usu = cs.findUsuarioByid(usuarioid);
		modelo.addAttribute("command", usu);
		
		return "editausuario";
	}
	
}
