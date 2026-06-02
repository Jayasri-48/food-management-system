package edu.jsp.swiggy.Swiggy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.swiggy.Swiggy.SwiggyService;
import edu.jsp.swiggy.Swiggy.hotal.Hotel;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hotel")
public class SwiggyController {
	@Autowired
	private SwiggyService swiggyService;
	
	@PostMapping("/save")
	public Hotel addFood(@RequestBody Hotel food) {
        return swiggyService.addFood(food);
    }
    
	@GetMapping("/fetchAll")
    public List<Hotel> getAllFood() {
        return swiggyService.getAllFood();
    }

	@DeleteMapping("/delete/{id}")
    public void deleteFood(@PathVariable int id) {
        swiggyService.deleteFood(id);
    }


}
