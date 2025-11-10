package br.edu.insper.exercicio.viagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

	@Autowired
	private ViagemService viagemService;

	@GetMapping
	public List<Viagem> listar() {
		return viagemService.listar();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Viagem criar(@RequestBody Viagem viagem) {
		return viagemService.criar(viagem);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Integer id) {
		viagemService.excluir(id);
	}
}


