package com.dodo.couse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dodo.couse.entities.User;

//fazemos isso para dizer que essa classe que é um recurso web que é implementado por um controlador Rest
@RestController
// @RequestMapping é usado para dar um nome para meu recurso
@RequestMapping(value = "/users")
public class UserResource {
	
	//tenho q indicar q esse metodo corresponde a requisição do tipo Get do HTTP usando @GetMapping 
	@GetMapping
	
	//metodo para acessar os usuarios.. tipo da resposta é a classe User
	//findAll é o nome do metodo que vai retornar meus usuarios
	public ResponseEntity<User> findAll(){
		//instanciado a classe User com seus atributos
		User u = new User(1L, "Larissa", "larissa@gmail.com", "11955451", "senha123");
		//retornando um ResponseEntity com um ok e colocando .body para retornar o corpo da resposta e usuario u 
		return ResponseEntity.ok(u);
	}

}
