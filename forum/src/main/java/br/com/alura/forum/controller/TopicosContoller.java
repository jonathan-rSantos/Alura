package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicosContoller {
	
	@GetMapping
	public List<TopicoDto> lista(){
		Topico topico = new Topico("JAVA", "Duvida de criação de classes", new Curso("Progamação", "Java"));
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
	
	
}
