package basic;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 10000000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		System.out.println(camera.name + camera.price + camera.name + camera.sold);
	}

}
