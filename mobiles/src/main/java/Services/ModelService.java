package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.ModelRepository;
import models.Model;

@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;

	private List<Model> models = modelRepository.findAll();

	public Model getModel(long id) {
		return modelRepository.findById(id).orElse(null);
	}

	public void setModel(Model model) {
		modelRepository.save(model);
	}

	public List<Model> getModels() {
		return models;
	}

}
