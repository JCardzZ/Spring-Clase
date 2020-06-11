package com.mm.mm;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mm.mm.model.Persona;




@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		
		Persona person = new Persona();
		person.setNombre("Manuel");
		person.setApellido("Cardoza");
		person.setTelefono("79202061");
		person.setEmail("cardozamanuel@gmail.com");
		
		Persona persona2 = new Persona();
		persona2.setNombre("Jesus");
		persona2.setApellido("Cardoza");
		persona2.setTelefono("79202061");
		persona2.setEmail("cardozajesusl@gmail.com");
		
		Persona persona3 = new Persona();
		persona3.setNombre("Test");
		persona3.setApellido("Cardoza");
		persona3.setTelefono("79202061");
		persona3.setEmail("cardozatest@gmail.com");
		
		List personas =  Arrays.asList(person,persona2,persona3);
			
		String mensaje  = "Hola desde controlador";
		modelo.addAttribute("saludo", mensaje);
		modelo.addAttribute("personas", personas);

		return "index";
		
	}
	
}
