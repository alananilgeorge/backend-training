//package controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import models.Brand;
//import models.Model;
//
//@RestController
//@RequestMapping("/brands")
//public class MobileController {
//	@GetMapping("brands")
//	public List<Brand> listBrand() {
//		List<Brand> brands = new ArrayList();
//		return brands;
//	}
//
//	@GetMapping("/test")
//	public String test() {
//		return "HELLO";
//	}
//	
//	@GetMapping("/phones")
//	public List<Model> listModels() {
//		List<Model> models = new ArrayList();
//		return models;
//	}
//
//	@GetMapping("brands/{id}")
//	public Brand viewBrand() {
//		return new Brand();
//	}
//
//	@GetMapping("model/{id}")
//	public Model viewModel() {
//		return new Model();
//	}
//
//	@PostMapping("brand")
//	@ResponseStatus(HttpStatus.OK)
//	public void createBrand(@RequestBody Brand bike) {
//
//	}
//
//	@ResponseStatus(HttpStatus.OK)
//	@PostMapping("model")
//	public void createModel(@RequestBody Model model) {
//
//	}
//
//}
