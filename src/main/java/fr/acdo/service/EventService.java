package fr.acdo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.acdo.domain.Event;
import fr.acdo.repository.EventRepository;

@Service
public class EventService {

	private EventRepository repo;

	@Autowired
	public EventService(EventRepository repo) {
		this.repo = repo;
	}

	public List<Event> getAllEvents() {
		return repo.findAll();
	}

	public Event getEventById(Long id) {
		return repo.findOne(id);
	}

	public Event saveEvent(Event event) {
		return repo.save(event);
	}

	public void deleteEvent(Long id) {
		repo.delete(id);
	}

	// QUERY METHODS of Repository

	// public List<Event> getEventsByUserId(Long id) {
	// return repo.findByUserId(id);
	// }
	//
	// public List<Event> getEventsByCategoryId(Long id) {
	// return repo.findByCategoryId(id);
	// }
	//
	// public List<Event> getEventsByProjectId(Long id) {
	// return repo.findByProjectId(id);
	// }

	public List<Event> getEventsByPriorityId(Long id) {
		return repo.findByPriorityId(id);
	}

	// public List<Event> getEventsByUserIdAndCategoryId(Long idUser, Long
	// idCategory) {
	// return repo.findByUserIdAndCategoryId(idUser, idCategory);
	// }
	//
	// public List<Event> getEventsByUserIdAndProjectId(Long idUser, Long
	// idProject) {
	// return repo.findByUserIdAndProjectId(idUser, idProject);
	// }
	//
	// public List<Event> getEventsByUserIdAndPriorityId(Long idUser, Long
	// idPriority) {
	// return repo.findByUserIdAndPriorityId(idUser, idPriority);
	// }
	//
	// public List<Event> getEventsByUserIdAndCategoryIdAndProjectId(Long
	// idUser, Long idCategory, Long idProject) {
	// return repo.findByUserIdAndCategoryIdAndProjectId(idUser, idCategory,
	// idProject);
	// }
	//
	// public List<Event> getEventsByUserIdAndCategoryIdAndPriorityId(Long
	// idUser, Long idCategory, Long idPriority) {
	// return repo.findByUserIdAndCategoryIdAndPriorityId(idUser, idCategory,
	// idPriority);
	// }
	//
	// public List<Event>
	// getEventsByUserIdAndCategoryIdAndProjectIdAndPriorityId(Long idUser, Long
	// idCategory,
	// Long idProject, Long idPriority) {
	// return repo.findByUserIdAndCategoryIdAndProjectIdAndPriorityId(idUser,
	// idCategory, idProject, idPriority);
	// }
	//
	// public List<Event> getEventsByCategoryIdAndProjectId(Long idCategory,
	// Long idProject) {
	// return repo.findByCategoryIdAndProjectId(idCategory, idProject);
	// }
	//
	// public List<Event> getEventsByCategoryIdAndPriorityId(Long idCategory,
	// Long idPriority) {
	// return repo.findByCategoryIdAndPriorityId(idCategory, idPriority);
	// }
	//
	// public List<Event> getEventsByCategoryIdAndProjectIddAndPriorityId(Long
	// idCategory, Long idProject,
	// Long idPriority) {
	// return repo.findByCategoryIdAndProjectIddAndPriorityId(idCategory,
	// idProject, idPriority);
	// }
	//
	// public List<Event> getEventsByProjectIdAndPriorityId(Long idProject, Long
	// idPriority) {
	// return repo.findByProjectIdAndPriorityId(idProject, idPriority);
	// }

}
