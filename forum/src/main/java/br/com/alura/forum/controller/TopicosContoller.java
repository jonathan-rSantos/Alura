package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosContoller {

	@Autowired
	private TopicoRepository topicoRepository;

	@GetMapping
	public List<TopicoDto> lista() {
		List<Topico> topicos = topicoRepository.findAll();
		return TopicoDto.converter(topicos);
	}
	
	//Detalhando um topico
	//@RequestMapping("/topico")
	//public List<TopicoDto> listaTopico(String nomeCurso){
		//List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		//return TopicoDto.converter(topicos);
	//}
	
	@PutMapping
	@RequestBody
	public void cadastrar () {
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
