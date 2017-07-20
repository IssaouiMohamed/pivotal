package com.imk.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imk.demo.exception.MyException;
import com.imk.demo.model.Car;
import com.imk.demo.services.WelcomeService;

/**
 * 
 * @author ISSAOUI Mohamed Khames
 *
 */

@RestController
public class DemoControler {

	@Autowired
	private WelcomeService services;

	private static final Logger logger = LoggerFactory.getLogger(DemoControler.class);

	@RequestMapping("/")
	public String index() {
		return " ============ " + services.getWelcomeMessage() + "!    ============== ";
	}

	@GetMapping("getAllCars")
	public ResponseEntity<List<Car>> getAll() {
		return new ResponseEntity<>(services.getCarList(), HttpStatus.ACCEPTED);
	}

	/**
	 * 
	 * @param id
	 * @return Car object or "Car Id doesn't found !"
	 * 
	 *         If you want to throw NumberFormatException enter String value instead
	 *         of number value We use global level exception : See
	 *         RestfulResponseExceptionHandler class
	 * @throws MyException
	 *             or NumberFormatException
	 */
	@GetMapping("getCarById/{id}")
	public ResponseEntity<?> getCarById(@PathVariable int id) throws MyException { // we can use @PathVariable("id") int
																					// id
		logger.info("getCarById called ....");
		for (Car car : services.getCarList()) {
			if (car.getId() == id) {
				return ResponseEntity.status(HttpStatus.OK).body(car);
			}
		}
		// return ResponseEntity.status(HttpStatus.OK).body("Car Id doesn't found !");
		throw new MyException("Car Id = " + id + " doesn't found ! " , HttpStatus.OK);
	}

	/**
	 * Enter String value to call NullPointerException global level See
	 * RestfulResponseExceptionHandler
	 * 
	 * @throws NulPointerException
	 */

	@GetMapping("callNPException")
	public ResponseEntity<?> callNPException() // we can add : throws NullPointerException
	{
		logger.info("callNPException method is called ......");
		Car car = null;
		return ResponseEntity.status(HttpStatus.OK).body(car.getBrand());
	}

	@GetMapping("callMyException")
	public ResponseEntity<Object> callException() throws MyException {
		logger.info("callException method is called ......");

		throw new MyException("blaaaaaaaabla exception", HttpStatus.CONFLICT);

	}

	/**
	 * 
	 * The @RequestParam annotation binds a web request parameter (i.e. query
	 * string) to a method parameter in a controller. * To test it use this syntax:
	 * http://localhost:8080/test?id=65
	 */
	@GetMapping("useRequestParam")
	public @ResponseBody ResponseEntity<?> test(@RequestParam int id) {

		return new ResponseEntity<>("RequestParam = " + id, HttpStatus.OK);
	}

}
