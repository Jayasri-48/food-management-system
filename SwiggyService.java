package edu.jsp.swiggy.Swiggy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.swiggy.Swiggy.hotal.Hotel;
import edu.jsp.swiggy.Swiggy.repository.SwiggyRepository;

@Service
public class SwiggyService {

	@Autowired
	private SwiggyRepository swiggyRepository;
	
	
	 public Hotel addFood(Hotel food) {
	        return swiggyRepository.save(food);
	    }

	    public List<Hotel> getAllFood() {
	        return swiggyRepository.findAll();
	    }

	    public void deleteFood(int id) {
	        swiggyRepository.deleteById(id);
	    }
}
