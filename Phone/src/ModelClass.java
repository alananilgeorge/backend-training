
import java.util.Scanner;

public class ModelClass {
	String modelName = new String();
	int price;
	int version;
	int id;
	BrandClass brand;
	public ModelClass(int id, String modelName, int price,int version, BrandClass brand) {
		this.modelName = modelName;
		this.price = price;
		this.brand = brand;
		this.version= version;
	}
}
