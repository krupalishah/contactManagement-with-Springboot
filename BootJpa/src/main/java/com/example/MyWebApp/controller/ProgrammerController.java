package com.example.MyWebApp.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.MyWebApp.dao.ContactsDao;
import com.example.MyWebApp.model.Contacts;
@RestController
public class ProgrammerController 
{ 
	@Autowired
	ContactsDao dao1;
	@RequestMapping("h")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("home.jsp");
		return mv;
	}
	@PostMapping("/contact")
	public Contacts addContact(@RequestBody Contacts contact)
	{
		dao1.save(contact);
		return contact;
	}
	
	@RequestMapping("/contacts")
	public List<Contacts> getProgrammers()
	{
		return dao1.findAll();
		
	}
	@GetMapping("/contact/{aid}")
	public Optional<Contacts> getProgrammer(@PathVariable("aid") int aid)
	{
		return dao1.findById(aid);
		
	}
	@DeleteMapping("/contact/{cid}")
	public void deleteContact(@PathVariable("cid") int cid)
	{
		dao1.deleteById(cid);

	}
	@PutMapping("/contact")
	public Contacts saveOrUpadateContact(@RequestBody Contacts contact)
	{
		dao1.save(contact);
		return contact;
	}
	@GetMapping("/getPage")
	public Page<Contacts> getPage(Pageable page)
	{
		return dao1.findAll(page);
	}
	
	@GetMapping("/sort")
	public List<Contacts> sortPage(Sort sort)
	{
		return dao1.findAll(sort);
	}
	
}
