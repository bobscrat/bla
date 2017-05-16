package fr.acdo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.acdo.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	List<Event> findByPriorityId(Long id);

	// List<Event> findByUserId(Long id);
	//
	// List<Event> findByCategoryId(Long id);
	//
	// List<Event> findByProjectId(Long id);
	//
	// List<Event> findByUserIdAndCategoryId(Long idUser, Long idCategory);
	//
	// List<Event> findByUserIdAndProjectId(Long idUser, Long idProject);
	//
	// List<Event> findByUserIdAndPriorityId(Long idUser, Long idPriority);
	//
	// List<Event> findByUserIdAndCategoryIdAndProjectId(Long idUser, Long
	// idCategory, Long idProject);
	//
	// List<Event> findByUserIdAndCategoryIdAndPriorityId(Long idUser, Long
	// idCategory, Long idPriority);
	//
	// List<Event> findByUserIdAndCategoryIdAndProjectIdAndPriorityId(Long
	// idUser, Long idCategory, Long idProject,
	// Long idPriority);
	//
	// List<Event> findByCategoryIdAndProjectId(Long idCategory, Long
	// idProject);
	//
	// List<Event> findByCategoryIdAndPriorityId(Long idCategory, Long
	// idPriority);
	//
	// List<Event> findByCategoryIdAndProjectIddAndPriorityId(Long idCategory,
	// Long idProject, Long idPriority);
	//
	// List<Event> findByProjectIdAndPriorityId(Long idProject, Long
	// idPriority);

}
