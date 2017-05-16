package fr.acdo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.acdo.domain.Event;
import fr.acdo.service.EventService;

@CrossOrigin(origins = "*") // à supprimer en prod
@RestController
@RequestMapping("/api")
public class EventController {

	private EventService service;

	public EventController(EventService service) {
		this.service = service;
	}

	@GetMapping("/events")
	public List<Event> listEvents() {
		List<Event> list = null;
		try {
			list = service.getAllEvents();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@GetMapping("/events/{id}")
	public Event getEvent(@PathVariable Long id) {
		return service.getEventById(id);
	}

	@GetMapping("/events?priority={id}")
	public List<Event> getEventsByPriorityId(@PathVariable Long id) {
		return service.getEventsByPriorityId(id);
	}

	@PostMapping("/events")
	public Event createEvent(@RequestBody @Valid Event event) {
		Event newEvent = null;
		try {
			newEvent = service.saveEvent(event);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newEvent;
	}

	@PutMapping("/events")
	public Event updateEvent(@RequestBody @Valid Event event) {
		Event newEvent = null;
		try {
			newEvent = service.saveEvent(event);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newEvent;
	}

	@DeleteMapping("/events/{id}")
	public void deleteEvent(@PathVariable Long id) {
		try {
			service.deleteEvent(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
