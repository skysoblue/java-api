package enums;

public class Toy {
	private String name;
	private int price;
	ToySpec spec;
	public Toy() {
		this("",0,null);
	}
	public Toy(String name, int price, ToySpec spec) {
		this.name = name;
		this.price = price;
		this.spec = spec;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public ToySpec getSpec() {
		return spec;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSpec(ToySpec spec) {
		this.spec = spec;
	}
	@Override
	public String toString() {
		return "장난감 [상품명=" + name + ", 가격=" + price + ", 스펙=" + spec + "]";
	}
	
	
}
