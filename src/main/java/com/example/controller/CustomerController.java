package com.example.controller;
import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by RANGA on 3/26/2017.
 */
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping("/customer/save")
	public String process(){
		customerService.save(new Customer("Raj", "Kiran"));
		customerService.save(new Customer("Raja", "Mohan"));
		customerService.save(new Customer("Hari", "Krishna"));
		customerService.save(new Customer("Mohana", "Ranga"));
		customerService.save(new Customer("Kiran", "Kumar"));
		return "Done";
	}
	
	
	@RequestMapping("/customer/findall")
	public String findAll(){
		String result = "<html>";
		
		for(Customer cust : customerService.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/customer/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = customerService.findOne(id);
		return result;
	}
	
	@RequestMapping("/customer/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "<html>";
		
		for(Customer cust: customerService.findByLastName(lastName)){
			result += "<div>" + cust.toString() + "</div>"; 
		}
		
		return result + "</html>";
	}
}

