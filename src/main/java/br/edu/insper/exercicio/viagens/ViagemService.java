package br.edu.insper.exercicio.viagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemService {

	@Autowired
	private ViagemRepository viagemRepository;

	public List<Viagem> listar() {
		return viagemRepository.findAll();
	}

	public Viagem criar(Viagem viagem) {
		return viagemRepository.save(viagem);
	}

	public void excluir(Integer id) {
		if (!viagemRepository.existsById(id)) {
			throw new RuntimeException("Viagem não encontrada");
		}
		viagemRepository.deleteById(id);
	}
}


