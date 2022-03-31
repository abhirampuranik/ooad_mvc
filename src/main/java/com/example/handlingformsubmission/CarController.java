package com.example.handlingformsubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CarController {

	@Autowired
	private CarRepository repository;
	

	@GetMapping("/car")
	public String carForm(Model model) {
		model.addAttribute("car", new Car());
		return "car";
	}




	@GetMapping({"/retrievecars","/"})
	public ModelAndView retrieve(Model model) {
		System.out.println("Cars found with findAll():");
		System.out.println("-------------------------------");
		for (Car car : repository.findAll()) {
			System.out.println(car);
		}
		System.out.println();
		ModelAndView mv = new ModelAndView("getall");
		mv.addObject("cars",repository.findAll());
		return mv;
	}
	

	@PostMapping("/car")
	public String carSubmit(@ModelAttribute Car car, Model model) {
		model.addAttribute("car", car);
		System.out.println(car.getCarName());

		System.out.println("This is before write");
		repository.save(new Car(car.getId(), car.getOwnerName(), car.getCarName(), car.getColor()));
		System.out.println("This is after write");
		return "result";
	}
}
