package fr.acdo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.acdo.domain.Priority;
import fr.acdo.service.PriorityService;

@CrossOrigin(origins = "*") // à supprimer en prod
@RestController
@RequestMapping("/api")
public class PriorityController {

	private PriorityService service;

	@Autowired
	public PriorityController(PriorityService service) {
		this.service = service;
	}

	@GetMapping("/priorities")
	public List<Priority> listPriorities() {
		List<Priority> list = null;
		try {
			list = service.getAllPriorities();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@GetMapping("/priorities/{id}")
	public Priority getPriority(@PathVariable Long id) {
		Priority priority = null;
		try {
			priority = service.getPriorityById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return priority;
	}

	@PostMapping("/priorities")
	public Priority savePriority(@RequestBody @Valid Priority priority) {
		Priority newPriority = null;
		try {
			newPriority = service.savePriority(priority);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newPriority;
	}

	@PutMapping("/priorities")
	public Priority updatePriority(@RequestBody @Valid Priority priority) {
		Priority newPriority = null;
		try {
			newPriority = service.savePriority(priority);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newPriority;
	}

	@DeleteMapping("/priorities/{id}")
	public void deletePriority(@PathVariable Long id) {
		try {
			service.deletePriority(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
