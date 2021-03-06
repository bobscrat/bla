package fr.acdo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.acdo.domain.Priority;
import fr.acdo.repository.PriorityRepository;

@Service
public class PriorityService {
	
	private PriorityRepository repo;

	@Autowired
	public PriorityService(PriorityRepository repo) {
		this.repo = repo;
	}
	
	public List<Priority> getAllPriorities() {
		return repo.findAll();
	}
	
	public Priority getPriorityById(Long id) {
		return repo.findOne(id);
	}
	
	public Priority savePriority(Priority priority) {
		return repo.save(priority);
	}
	
	public void deletePriority(Long id) {
		repo.delete(id);
	}

}
