import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	static Scanner s = new Scanner(System.in);
	int sc = 1;
	int bc = 1;
	static String pname = new String();
	static String bname = new String();
	static int price, version;
	static BrandClass br;
	static Map<String, BrandClass> brandMap = new HashMap<String, BrandClass>();
	static Map<Integer, ModelClass> phoneMap = new HashMap<Integer, ModelClass>();

	public static void main(String[] args) {
		int c;
		boolean x = true;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println(
					"1. Add brand\n2.Add phone\n3.View all phones\n4.View phone details\n5.Remove phone\n6.Edit phone details\n7.Exit\n");
			c = s.nextInt();
			switch (c) {
			case 1:
				addBrand();
				break;
			case 2:
				addPhone();
				break;
			case 3:
				viewAllPhones();
				break;
			case 4:
				viewPhone();
				break;
			case 5:
				deletePhone();
				break;
			case 6:
				edit();
				break;
			case 7:
				x = false;
				break;

			default:
				System.out.println("Wrong choice");
				System.out.println();
			}
		} while (x);

	}

	private static void addBrand() {
		System.out.println("Enter brand details:");
		Scanner s = new Scanner(System.in);
		System.out.print("Name: ");
		System.out.println();
		bname = s.next();
		BrandClass brand = new BrandClass(bname);
		brandMap.put(bname, brand);
	}

	private static void addPhone() {
		System.out.println("Enter phone details:");
		System.out.print("Name: ");
		pname = s.nextLine();
		System.out.println("Price: ");
		price = s.nextInt();
		System.out.println("OS Version: ");
		version = s.nextInt();
		System.out.println("Brand: ");
		bname = s.next();
		System.out.println();
		if (brandMap.containsKey(bname)) {

			br = brandMap.get(bname);
		} else

		{
			System.out.println("No such brand exists. Add brand first");
		}
		ModelClass model = new ModelClass(phoneMap.size() + 1, pname, price, version, br);
		phoneMap.put(phoneMap.size() + 1, model);
	}

	private static void viewAllPhones() {
		if (phoneMap.size() > 0) {
			System.out.println();
			System.out.println("Phones are ");
			System.out.println();
			phoneMap.forEach((k, v) -> {
				System.out.println("ID    Name");
				System.out.println(k + "  " + v.modelName);
				System.out.println();
			});
		} else {
			System.out.println("No phones in stock");
		}
	}

	private static void viewPhone() {
		System.out.println("Enter phone id");
		int id = s.nextInt();
		ModelClass model = phoneMap.get(id);
		System.out.println("Details are");
		System.out.println("Name: " + model.brand.brandName + " " + model.modelName);
		System.out.println("Price: " + model.price);
		System.out.println("Version: " + model.version);
		System.out.println();
	}

	private static void deletePhone() {
		System.out.print("Enter id of phone you want to delete: ");
		int id = s.nextInt();
		ModelClass model = phoneMap.get(id);
		phoneMap.remove(id);
		model = null;

	}

	private static void edit() {
		System.out.print("Enter id of the phone to update: ");
		int id = s.nextInt();
		ModelClass phone = phoneMap.get(id);
		System.out.println("Enter new price: ");
		System.out.println();
		phone.price = s.nextInt();

	}
}
